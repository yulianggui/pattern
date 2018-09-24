package pattern.factory.simple;

import pattern.factory.AliPay;
import pattern.factory.CashPay;
import pattern.factory.IPay;
import pattern.factory.WechatPay;

public class SimpleFactory {

    public IPay getPay(String payWay){
        if("cash".equals(payWay)){
            return new CashPay();
        }else if("wechat".equals(payWay)){
            return new WechatPay();
        }else if("alipay".equals(payWay)){
            return new AliPay();
        }else if("card".equals(payWay)){
            return new CashPay();
        }else{
            System.out.println("该工厂不能生产！");
        }
        return null;
    }
}
