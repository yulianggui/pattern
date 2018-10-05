package pattern.observer.subject;

import pattern.observer.core.Event;

/**
 * create by zhegui on 2018/10/6
 */
public class Observer {

    public void advice(Event event){
        System.out.println("我订阅的消息发生了改变，监听结果为\n");
        System.out.println(event);
        System.out.println("监听逻辑结束！");
    }
}
