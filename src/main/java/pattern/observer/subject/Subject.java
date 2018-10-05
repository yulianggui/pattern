package pattern.observer.subject;

import pattern.observer.core.EventListener;
import pattern.observer.core.EventType;

/**
 * create by zhegui on 2018/10/6
 */
public class Subject extends EventListener{

    public void add(){
        System.out.println("调用添加的方法！");
        this.trigger(EventType.ADD);
    }

    public void remove(){
        System.out.println("调用删除的方法！");
        this.trigger(EventType.MOVE);
    }

}
