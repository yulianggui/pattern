package pattern.factory.abstractfactory;

/**
 * create by zhegui on 2018/9/24
 */
public class AbstartFactoryTest {

    public static void main(String[] args) {

        //现金“流水线”工厂
        AbstarctFactory factory = new ACashFactory();
        factory.getPay().doPay();
        factory.getStore().doStore();

        //微信“流水线”工厂
        AbstarctFactory factory1 = new AWechatFactory();
        factory1.getPay().doPay();
        factory1.getStore().doStore();
    }
}
