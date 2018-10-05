package pattern.adapter;

/**
 * create by zhegui on 2018/10/5
 */
public class InterfacesAdapterTest {

    public static void main(String[] args) {
        TypeCAdapterUsb adapter = new TypeCAdapterUsb(new UsbImpl());
        adapter.typeCCharging();
    }
}
