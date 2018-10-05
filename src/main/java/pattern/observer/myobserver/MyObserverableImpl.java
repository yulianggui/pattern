package pattern.observer.myobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * create by zhegui on 2018/10/6
 */
public class MyObserverableImpl implements IObserverable{

    private List<IMyObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(IMyObserver myObserver) {
        observers.add(myObserver);
    }

    @Override
    public void removeObserver(IMyObserver myObserver) {
        if(observers.size() != 0)
            observers.remove(myObserver);
    }

    @Override
    public void notifyObserver(String message) {
        for (IMyObserver observer: observers) {
            observer.recevice(message);
        }
    }

    public void doSomething(){
        System.out.println("我已经更改了！");
        notifyObserver("update !!!!!!!!!");
    }
}
