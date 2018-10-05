package pattern.proxys.myproxy;

import java.lang.reflect.Method;

/**
 * create by zhegui on 2018/10/5
 */
public interface ZGInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
