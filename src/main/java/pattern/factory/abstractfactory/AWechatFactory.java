package pattern.factory.abstractfactory;

import pattern.factory.IPay;
import pattern.factory.IStore;
import pattern.factory.WechatPay;
import pattern.factory.WechatStore;

/**
 * create by zhegui on 2018/9/24
 */
public class AWechatFactory extends AbstarctFactory{
    @Override
    IPay getPay() {
        return new WechatPay();
    }

    @Override
    IStore getStore() {
        return new WechatStore();
    }
}
