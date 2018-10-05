package pattern.strategy.pay;

import pattern.strategy.pay.payport.AliPay;

/**
 * create by zhegui on 2018/10/5
 */
public class PayStrategyTest {

    public static void main(String[] args) {

        Order order = new Order("123", "20181005001", 365.5);

        order.pay(PayType.JD_PAY);
    }
}
