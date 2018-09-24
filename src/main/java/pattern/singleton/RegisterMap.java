package pattern.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * create by zhegui on 2018/9/24
 */
public class RegisterMap {

    private volatile static Object bean;

    private RegisterMap(){}


    private static final Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String name){
        if(ioc.containsKey(name)){
            return ioc.get(name);
        }else{
            try {

                // 如果不使用volatile 修饰，这里会出现线程问题
                // 可能是指令重排序的问
                bean = Class.forName(name).newInstance();

                if(!ioc.containsKey(name)){
                    ioc.put(name, bean);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ioc.get(name);
    }
}
