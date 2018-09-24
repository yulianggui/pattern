package pattern.factory;

public class AliPay implements IPay{

    @Override
    public void doPay() {
        System.out.println("支付宝消费！");
    }
}
