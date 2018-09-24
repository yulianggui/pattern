package pattern.factory.factorymerg;

import pattern.factory.IPay;

/**
 *
 * 这里相当于将 多个抽象工厂的实现类包装在一个工厂类里面
 *    减少了工厂类的诞生
 * create by zhegui on 2018/9/24
 */
public abstract class AbstartFactoryDemo {

    abstract IPay getCashPay();

    abstract IPay getWechatPay();

    abstract IPay getAliPay();

    abstract IPay getCardPay();
}
