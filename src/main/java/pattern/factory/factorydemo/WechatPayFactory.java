package pattern.factory.factorydemo;

import pattern.factory.IPay;
import pattern.factory.WechatPay;

/**
 * create by zhegui on 2018/9/24
 */
public class WechatPayFactory implements IFactoryDemo{
    @Override
    public IPay getPay() {
        return new WechatPay();
    }
}
