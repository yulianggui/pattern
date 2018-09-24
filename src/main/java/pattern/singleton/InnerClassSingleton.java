package pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Zhegui
 *
 */
public class InnerClassSingleton {


	//防止反射的方式获取start
	private static boolean FLAG = false;

	private InnerClassSingleton(){

		synchronized (InnerClassSingleton.class){
			System.out.println("ddddddd");
			if(!FLAG){
				FLAG = !FLAG;
			}else{
				System.out.println("dggggggg");
				throw new RuntimeException("正在被攻击！");
			}
		}

	}


	//end

	private static class InnerSingtelonHolder{
		private static InnerClassSingleton instance = new InnerClassSingleton();
	}
	
	public static final InnerClassSingleton getInstance(){
		return InnerSingtelonHolder.instance;
	}


	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

		Class<?> clazz = InnerClassSingleton.class;
		InnerClassSingleton singleton2 = InnerClassSingleton.getInstance();
		Constructor c =  clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		InnerClassSingleton singleton1 = (InnerClassSingleton)c.newInstance();
	}

}
