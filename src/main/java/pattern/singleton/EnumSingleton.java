package pattern.singleton;

public enum EnumSingleton {
 
	INSTANCE;
	
	public void doSomething(){
		System.out.println("enum singleton doing....");
	}
}
