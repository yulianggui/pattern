package pattern.adapter;

import pattern.adapter.ITypeC;
import pattern.adapter.IUsb;

/**
 * create by zhegui on 2018/10/5
 */
public class TypeCAdapterUsb implements ITypeC{

    private IUsb usbImpl;

    public TypeCAdapterUsb(IUsb usbImpl) {
        this.usbImpl = usbImpl;
    }

    @Override
    public void typeCCharging() {
        usbImpl.usbCharging();
    }
}
