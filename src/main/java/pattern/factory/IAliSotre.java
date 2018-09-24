package pattern.factory;

/**
 * create by zhegui on 2018/9/24
 */
public class IAliSotre implements IStore{
    @Override
    public void doStore() {
        System.out.println("支付宝存款，存储到支付宝钱包！");
    }
}
