package pattern.proxys.myproxy;

import pattern.proxys.dynamic.IDyCustomer;
import pattern.proxys.dynamic.OurDyCustomer;
import pattern.proxys.dynamic.ProxyDyCustomer;

/**
 * create by zhegui on 2018/10/5
 */
public class ZGProyxCustomerTest {

    public static void main(String[] args) {
        IDyCustomer dyCustomer = new ZGProxyDyCustomer().getInstance(new OurDyCustomer());
        dyCustomer.buyHome();
        System.out.println("----------------");
        dyCustomer.buyCar("dddddd");
    }
}
