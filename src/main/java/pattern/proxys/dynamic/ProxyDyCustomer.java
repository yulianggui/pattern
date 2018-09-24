package pattern.proxys.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by zhegui on 2018/9/25
 */
public class ProxyDyCustomer implements InvocationHandler{

    private IDyCustomer target;


    public IDyCustomer getInstance(IDyCustomer target){

        this.target = target;
        IDyCustomer object = (IDyCustomer) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
        return object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是代理商，准备为你服务！");
        Object object = method.invoke(this.target, args);
        System.out.println("消费者已经确认消费了，又可以赚一波代理费和提出！");
        return object;
    }
}
