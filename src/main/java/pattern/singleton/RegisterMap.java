package pattern.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * create by zhegui on 2018/9/24
 */
public class RegisterMap {

    private RegisterMap(){}

    private static final Map<String, RegisterMap> map = new ConcurrentHashMap<>();

    public static RegisterMap getInstance(String name){
        if(name == null){
            name = RegisterMap.class.getName();
        }
        if(map.get(name) == null){
            map.put(name, new RegisterMap());
        }
        return map.get(name);
    }
}
