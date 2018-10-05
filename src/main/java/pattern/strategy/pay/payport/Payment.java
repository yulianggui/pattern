package pattern.strategy.pay.payport;

import pattern.strategy.pay.PayState;

/**
 * create by zhegui on 2018/10/5
 */
public interface Payment {

    public PayState pay(String uid, double amount);
}
