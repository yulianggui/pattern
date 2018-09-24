package pattern.singleton;

/**
 * @author Zhegui
 *
 */
public class BolckSynLazySingleton {
	
	private BolckSynLazySingleton(){}
	
	private volatile static  BolckSynLazySingleton instance = null; 
	
	public static BolckSynLazySingleton getInstance(){
		
		if(instance == null){
			/**
			 */      
			synchronized (BolckSynLazySingleton.class) {
				if(instance == null){
					instance = new BolckSynLazySingleton();
				}
			}
		}
		return instance;
	}
}
