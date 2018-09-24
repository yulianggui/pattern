package pattern.singleton;

/**
 * @author Zhegui
 *
 */
public class InnerClassSingleton {

	private InnerClassSingleton(){}
	
	private static class InnerSingtelonHolder{
		private static InnerClassSingleton instance = new InnerClassSingleton();
	}
	
	public static InnerClassSingleton getInstance(){
		return InnerSingtelonHolder.instance;
	}
}
