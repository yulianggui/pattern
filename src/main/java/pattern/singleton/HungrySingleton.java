package pattern.singleton;

/**
 * @author Zhegui
 *
 */
public class HungrySingleton {

	private HungrySingleton(){}

	//先静态、后动态
	//先属性、后方法
	//先上后下


	private static final HungrySingleton instance = new HungrySingleton();
	
	public static HungrySingleton getInsatnce(){
		return instance;
	}
	
}
