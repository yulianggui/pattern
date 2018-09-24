package pattern.factory;

public class WechatPay implements IPay{

    @Override
    public void doPay() {
        System.out.println("微信消费！");
    }
}
