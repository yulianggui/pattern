package pattern.adapter;

/**
 * create by zhegui on 2018/10/5
 */
public class UsbImpl implements IUsb{

    @Override
    public void usbCharging() {
        System.out.println("UsbImpl 接口充电！");
    }
}
