package pattern.proxys.dynamic;

import sun.misc.ProxyGenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * create by zhegui on 2018/9/25
 */
public class ProxyDyCustomerTest {

    public static void main(String[] args) {
        IDyCustomer dyCustomer = new ProxyDyCustomer().getInstance(new OurDyCustomer());
        dyCustomer.buyHome();

        System.out.println("------------");
        dyCustomer.buyCar("baoma");

        //打印代理对象的字节码文件名
        System.out.println(dyCustomer.getClass());

        //将字节码文件写到硬盘，查看字节码文件，深入理解动态生成的代理类对象
        FileOutputStream fos = null;
        try {
            //获取$Proxy0 class文件的字节
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IDyCustomer.class});
            fos = new FileOutputStream("E:\\$Proxy0.class");
            fos.write(bytes);
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
