package pattern.factory.factorydemo;

import pattern.factory.IPay;

/**
 * create by zhegui on 2018/9/24
 */
public class FactoryDemoTest {

    public static void main(String[] args) {

        //现金流工厂
        IFactoryDemo cashFactory = new CashPayFactory();

        IPay pay = cashFactory.getPay();
        pay.doPay();


        //微信支付
        IFactoryDemo wechatFactory = new WechatPayFactory();
        IPay wechatPay = wechatFactory.getPay();
        wechatPay.doPay();

    }
}
