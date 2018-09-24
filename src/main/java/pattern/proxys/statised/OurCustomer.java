package pattern.proxys.statised;

/**
 * create by zhegui on 2018/9/25
 */
public class OurCustomer implements ICustomer{

    @Override
    public void buyHome() {
        System.out.println("我是消费者，很满意现在的房子，准备付款！");
        System.out.println("付款完成！");
    }

    @Override
    public void buyCar(String name) {
        System.out.println("我想要买："+name);
    }
}
