package pattern.proxys.myproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * create by zhegui on 2018/10/5
 */
public class ZGProxy {

    public static Object newProxyInstance(ZGClassLoader classLoader, Class<?>[] interfaces, ZGInvocationHandler h){


        try{
        //1、动态生成源代码.java文件
        String src = generateJavaSrc(interfaces);

        //2、Java文件输出磁盘
        String filePath = ZGProxy.class.getResource("").getPath();
        System.out.println(filePath);
        File file = new File(filePath + "$Proxy0.java");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(src);
        fileWriter.flush();
        fileWriter.close();

        //3、把生成的.java文件编译成.class字节码文件
        //获取系统编译器
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manager.getJavaFileObjects(file);
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null,null, null, iterable);
        task.call();
        manager.close();
        //4、编译生成的.class文件加载到JVM中来
        Class proxyClass = classLoader.findClass("$Proxy0");
        Constructor c = proxyClass.getConstructor(ZGInvocationHandler.class);
        file.delete();
        //5、返回字节码重组以后的新的代理对象

        return c.newInstance(h);
        }catch (Throwable e){
            e.printStackTrace();
        }

        return null;
    }

    private static String generateJavaSrc(Class<?>[] interfaces){
        StringBuffer sb = new StringBuffer();
        String rn = "\r\n";

        //导入包
        sb.append("package pattern.proxys.myproxy;").append(rn);
        sb.append("import pattern.proxys.dynamic.IDyCustomer;").append(rn);
        sb.append("import pattern.proxys.myproxy.ZGInvocationHandler;").append(rn);
        sb.append("import java.lang.reflect.Method;").append(rn);
        //定义类名
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{").append(rn);

            //构造方法
            sb.append("private ZGInvocationHandler h;").append(rn);
            sb.append("public $Proxy0(ZGInvocationHandler h){").append(rn);
                sb.append("this.h = h;").append(rn);
            sb.append("}").append(rn);

            //生成接口实现的方法
            for(Method method : interfaces[0].getMethods()){

                //方法名
                sb.append("public " + method.getReturnType().getName() + " " + method.getName() + "(");

                //参数列表
                Parameter[] parameters = method.getParameters();
                if(parameters.length > 0){
                    for(int i=0; i < parameters.length ; i++){
                        sb.append(parameters[i].getType().getName() + " " + parameters[i].getName());
                        if((i +1) < parameters.length){
                            sb.append(",");
                        }
                    }
                }
                sb.append(") {").append(rn);

                    //调用h.invoke的方法
                    sb.append("try{").append(rn);

                        //获取要调用的方法
                        sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\""+ method.getName() +"\",new Class[]{");
                        if(parameters.length > 0){
                            for(int j=0; j < parameters.length ; j++){
                                sb.append(parameters[j].getType().getName() + ".class");
                                if((j +1) < parameters.length){
                                    sb.append(",");
                                }
                            }
                        }
                        sb.append("});").append(rn);

                        //通过h.invoke调用，在invoke里面进行增强
                        sb.append("System.out.println(\"ZGProyx code!!!\");").append(rn);
                        sb.append("this.h.invoke(this, m, ");
                        if(parameters.length > 0){

                            // 这里 默认参数为null
                            sb.append("new Object[]{");
                                for(int i=0; i < parameters.length ; i++){
                                    sb.append("null");
                                    if((i +1) < parameters.length){
                                        sb.append(",");
                                    }
                                }

                            sb.append("}");
                        }else{
                            sb.append("null");
                        }
                        sb.append(");").append(rn);
                    sb.append("}catch(Throwable e){").append(rn);
                        sb.append("e.printStackTrace();").append(rn);
                    sb.append("}").append(rn);


                sb.append("}").append(rn);
            }

        sb.append("}").append(rn);
        return sb.toString();
    }
}
