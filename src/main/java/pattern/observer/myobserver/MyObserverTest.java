package pattern.observer.myobserver;

/**
 * create by zhegui on 2018/10/6
 */
public class MyObserverTest {

    public static void main(String[] args) {

        MyObserverableImpl observerable = new MyObserverableImpl();
        IMyObserver observerA = new MyObserverA();
        observerable.registerObserver(observerA);
        observerable.registerObserver(new MyObserverB());
        observerable.doSomething();

        System.out.println("----------------------");
        observerable.removeObserver(observerA);
        observerable.doSomething();

    }
}
