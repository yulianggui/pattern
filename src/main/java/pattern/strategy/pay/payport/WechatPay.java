package pattern.strategy.pay.payport;

import pattern.strategy.pay.PayState;

/**
 * create by zhegui on 2018/10/5
 */
public class WechatPay implements Payment{
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用微信钱包支付！！！");
        System.out.println("支付完成！，微信钱包余额为！");
        return new PayState(1, "支付完成！", amount);
    }
}
