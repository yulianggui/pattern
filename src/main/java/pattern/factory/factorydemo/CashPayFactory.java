package pattern.factory.factorydemo;

import pattern.factory.CashPay;
import pattern.factory.IPay;

/**
 * create by zhegui on 2018/9/24
 */
public class CashPayFactory implements IFactoryDemo{
    @Override
    public IPay getPay() {
        return new CashPay();
    }
}
