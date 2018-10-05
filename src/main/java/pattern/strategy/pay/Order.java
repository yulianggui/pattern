package pattern.strategy.pay;

import pattern.strategy.pay.payport.Payment;

/**
 * create by zhegui on 2018/10/5
 */
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    //完美地解决了switch的过程，不需要在代码逻辑中希望switch
    //或者if --- else if
    public PayState pay(PayType payType){
        return payType.get().pay(uid, amount);
    }
}
