package pattern.strategy.pay;

import pattern.strategy.pay.payport.AliPay;
import pattern.strategy.pay.payport.JDPay;
import pattern.strategy.pay.payport.Payment;
import pattern.strategy.pay.payport.WechatPay;

/**
 * create by zhegui on 2018/10/5
 */
public enum PayType {

    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    JD_PAY(new JDPay());

    private Payment payment;

    private PayType(Payment payment ){
        this.payment = payment;
    }

    public Payment get(){
        return this.payment;
    }
}
