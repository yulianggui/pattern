package pattern.factory.simple;

import pattern.factory.IPay;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        SimpleFactory factory = new SimpleFactory();
        //IPay cashPay = factory.getPay("cash");
        //cashPay.doPay();

        IPay wechatPay = factory.getPay("wechat");
        wechatPay.doPay();
    }
}
