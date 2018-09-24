package pattern.factory.factorymerg;

import pattern.factory.AliPay;
import pattern.factory.CardPay;
import pattern.factory.IPay;
import pattern.factory.factorydemo.CashPayFactory;
import pattern.factory.factorydemo.WechatPayFactory;

/**
 *
 * 抽象的工厂
 *    在这里还可以写扩展逻辑
 *
 *
 * create by zhegui on 2018/9/24
 */
public class MergFactory extends AbstartFactoryDemo{

    /**
     * 这里可以结合 工厂模式使用
     *     混合使用
     * @return
     */
    @Override
    IPay getCashPay() {
        return new CashPayFactory().getPay();
    }

    @Override
    IPay getWechatPay() {
        return new WechatPayFactory().getPay();
    }

    @Override
    IPay getAliPay() {
        return new AliPay();
    }

    @Override
    IPay getCardPay() {
        return new CardPay();
    }
}
