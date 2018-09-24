package pattern.singleton;

/**
 * @author Zhegui
 *
 */
public class SerSingleton implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6405221629370661102L;
	
	public static SerSingleton INSTANCE = new SerSingleton();     

	protected SerSingleton() {}     

	private Object readResolve() {     
       return INSTANCE;     
	}  
}
