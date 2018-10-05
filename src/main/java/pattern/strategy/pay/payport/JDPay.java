package pattern.strategy.pay.payport;

import pattern.strategy.pay.PayState;

/**
 * create by zhegui on 2018/10/5
 */
public class JDPay implements Payment{
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用JD白条支付！！！");
        System.out.println("支付完成！，JD白条已经生成，记得按时还款！！");
        return new PayState(1, "支付完成！", amount);
    }
}
