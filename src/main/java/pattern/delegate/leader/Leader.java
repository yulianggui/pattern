package pattern.delegate.leader;

import java.util.HashMap;
import java.util.Map;

/**
 * create by zhegui on 2018/10/5
 */
public class Leader implements ITarget{

    private Map<String, ITarget> targetMap = new HashMap<>();

    public Leader(){
        targetMap.put("a-doing", new TargetA());
        targetMap.put("b-doing", new TargetB());
    }

    @Override
    public void doSomething(String command) {
        disPatcher(command);
    }

    private void disPatcher(String command){
        targetMap.get(command+"-doing").doSomething(command);
    }
}
