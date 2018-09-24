package pattern.factory;

public class CardPay implements IPay{

    @Override
    public void doPay() {
        System.out.println("银行卡消费！");
    }
}
