package pattern.observer.myobserver;

/**
 * create by zhegui on 2018/10/6
 */
public interface IObserverable {

    /**
     * 注册观察者
     * @param myObserver
     */
    public void registerObserver(IMyObserver myObserver);

    /**
     * 删除观察者
     * @param myObserver
     */
    public void removeObserver(IMyObserver myObserver);

    /**
     * 通知观察者
     */
    public void notifyObserver(String message);
}
