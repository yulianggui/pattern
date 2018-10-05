package pattern.observer.core;

import java.lang.reflect.Method;

/**
 * create by zhegui on 2018/10/6
 */
public class Event {

    /**
     * 事件源头
     */
    private Object source;

    /**
     * 通知的方法
     */
    private Method callbackMethod;

    /**
     * 通知目标
     */
    private Object target;

    /**
     * 触发的动作
     */
    private String trigger;

    private long time;

    public Event(Method callbackMethod, Object target) {
        this.callbackMethod = callbackMethod;
        this.target = target;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Method getCallbackMethod() {
        return callbackMethod;
    }

    public void setCallbackMethod(Method callbackMethod) {
        this.callbackMethod = callbackMethod;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    long getTime() {
        return time;
    }

    void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event \n{" + "\n" +
                "source=" + source + "\n" +
                ", callbackMethod=" + callbackMethod + "\n" +
                ", target=" + target + "\n" +
                ", trigger='" + trigger + '\'' + "\n" +
                ", time=" + time + "\n" +
                '}';
    }
}
