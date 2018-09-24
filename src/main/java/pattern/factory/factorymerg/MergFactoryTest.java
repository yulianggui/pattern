package pattern.factory.factorymerg;

import pattern.factory.IPay;

/**
 * create by zhegui on 2018/9/24
 */
public class MergFactoryTest {

    public static void main(String[] args) {
        AbstartFactoryDemo factory = new MergFactory();

        //刷卡
        IPay cardPay = factory.getCardPay();
        cardPay.doPay();

        //支付宝支付
        IPay aliPay = factory.getAliPay();
        aliPay.doPay();
    }
}
