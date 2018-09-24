package pattern.factory;

/**
 * create by zhegui on 2018/9/24
 */
public class WechatStore implements IStore{
    @Override
    public void doStore() {
        System.out.println("微信存款，存到微信钱包！");
    }
}
