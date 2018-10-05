package pattern.proxys.myproxy;

import pattern.proxys.dynamic.IDyCustomer;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by zhegui on 2018/10/5
 */
public class ZGProxyDyCustomer implements ZGInvocationHandler{

    private IDyCustomer target;


    public IDyCustomer getInstance(IDyCustomer target){

        this.target = target;
        IDyCustomer object = (IDyCustomer) ZGProxy.newProxyInstance(new ZGClassLoader(),target.getClass().getInterfaces(),this);
        return object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ZGProyx start 我是代理商，准备为你服务！");
        Object object = method.invoke(this.target, args);
        System.out.println("ZGProyx start end, 消费者已经确认消费了，又可以赚一波代理费和提出！");
        return object;
    }
}
