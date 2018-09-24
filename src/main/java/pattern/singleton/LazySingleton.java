package pattern.singleton;

/**
 * @author Zhegui
 *
 */
public class LazySingleton {

	private LazySingleton(){}
	
	private static LazySingleton instance = null; 
	
	public static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}
