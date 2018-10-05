package pattern.observer.myobserver;

/**
 * create by zhegui on 2018/10/6
 */
public class MyObserverA implements IMyObserver{

    @Override
    public void recevice(String message) {
        System.out.println(message);
        System.out.println("我是观察者A，我收到了消息");
    }
}
