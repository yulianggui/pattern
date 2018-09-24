package pattern.factory;

/**
 * create by zhegui on 2018/9/24
 */
public class ICardStore implements IStore{

    @Override
    public void doStore() {
        System.out.println("银行卡存款，将钱存储到银行卡！");
    }
}
