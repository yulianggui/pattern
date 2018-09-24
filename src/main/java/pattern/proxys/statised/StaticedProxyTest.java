package pattern.proxys.statised;

/**
 * create by zhegui on 2018/9/25
 */
public class StaticedProxyTest {

    public static void main(String[] args) {
        ProxyCustomer pc = new ProxyCustomer(new OurCustomer());
        pc.buyHome();

        pc.buyCar("baoma");
    }

}
