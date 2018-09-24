package pattern.proxys.statised;

/**
 *
 *
 * create by zhegui on 2018/9/25
 */
public class ProxyCustomer implements ICustomer{

    private ICustomer customer;

    public ProxyCustomer(ICustomer customer) {
        this.customer = customer;
    }


    @Override
    public void buyHome() {
        System.out.println("我是代理商，现在正准备帮消费者寻找适合的房子！");
        System.out.println("已经找到合适的房子，告知消费者办理付款等操作！");
        customer.buyHome();
        System.out.println("消费者已经付款，可以办理后续手续，补办材料等！");
        System.out.println("同时，拿到了我的提成！");
    }

    @Override
    public void buyCar(String name) {
        System.out.println("我是代理商，正在帮忙办理买车手续！");
        if("luhu".equals(name)){
            System.out.println("luhu 暂时没有了！");
            return;
        }
        System.out.println("告知消费者，可以买车了！");
        customer.buyCar(name);
        System.out.println("为消费者，帮忙处理后续手续！");
    }
}
