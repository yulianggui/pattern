package pattern.factory;

/**
 * create by zhegui on 2018/9/24
 */
public class CashStore implements IStore{
    @Override
    public void doStore() {
        System.out.println("现金存款，存到保险柜中！");
    }
}
