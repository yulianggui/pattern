package pattern.factory.abstractfactory;

import pattern.factory.CashPay;
import pattern.factory.CashStore;
import pattern.factory.IPay;
import pattern.factory.IStore;

/**
 * create by zhegui on 2018/9/24
 */
public class ACashFactory extends AbstarctFactory{

    @Override
    IPay getPay() {
        return new CashPay();
    }

    @Override
    IStore getStore() {
        return new CashStore();
    }
}
