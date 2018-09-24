package pattern.singleton;

import java.io.*;

/**
 * create by zhegui on 2018/9/24
 */
public class Seriable implements Serializable{


    private static final long serialVersionUID = -7210769567077544438L;

    private Seriable(){}

    private static final Seriable INSTANCE = new Seriable();

    public static Seriable getInstance(){
        return INSTANCE;
    }

    //JVM 调用，保证序列化后的单例
    private Object readResolve(){
        return INSTANCE;
    }

    public static void main(String[] args) {

        Seriable s1 = Seriable.getInstance();
        Seriable s2 = null;

        try {

            FileOutputStream fos = new FileOutputStream("seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            fos.close();
            oos.close();
            FileInputStream fis = new FileInputStream("seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);getInstance();
            s2 = (Seriable) ois.readObject();
            fis.close();
            ois.close();
            System.out.println(s1 == s2);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
