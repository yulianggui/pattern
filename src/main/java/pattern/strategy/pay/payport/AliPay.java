package pattern.strategy.pay.payport;

import pattern.strategy.pay.PayState;

/**
 * create by zhegui on 2018/10/5
 */
public class AliPay implements Payment{
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝支付！！！");
        System.out.println("支付完成！，支付宝余额为！");
        return new PayState(1, "支付完成！", amount);
    }
}
