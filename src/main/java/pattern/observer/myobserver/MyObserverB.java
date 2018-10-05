package pattern.observer.myobserver;

/**
 * create by zhegui on 2018/10/6
 */
public class MyObserverB implements IMyObserver{

    @Override
    public void recevice(String message) {
        System.out.println(message);
        System.out.println("我是观察者B，我收到了消息");
    }
}
