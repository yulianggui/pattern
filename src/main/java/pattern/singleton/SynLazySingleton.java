package pattern.singleton;

public class SynLazySingleton {

	private SynLazySingleton(){}
	
	private static SynLazySingleton instance = null; 
	
	public synchronized static SynLazySingleton getInstance(){
		if(instance == null){
			instance = new SynLazySingleton();
		}
		return instance;
	}
}
