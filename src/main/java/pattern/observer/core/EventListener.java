package pattern.observer.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * create by zhegui on 2018/10/6
 */
public class EventListener {

    private Map<Enum, Event> enumEventMap = new HashMap<>();

    public void addListener(Enum enumType,Object target, Method callbackMethod){
        Event event = new Event(callbackMethod, target);
        event.setTrigger(enumType.toString());
        enumEventMap.put(enumType, event);
    }

    public void trigger(Enum enumType){
        if(!enumEventMap.containsKey(enumType)){
            return;
        }
        this.trigger(enumEventMap.get(enumType));
    }

    private void trigger(Event event){
        try{
            event.setSource(this);
            event.setTime(System.currentTimeMillis());
            Method callbackMethod = event.getCallbackMethod();
            callbackMethod.invoke(event.getTarget(), event);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
