package pattern.factory;

public class CashPay implements IPay{

    @Override
    public void doPay() {
        System.out.println("现金消费！");
    }
}
