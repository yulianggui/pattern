package pattern.observer.mouse;

import pattern.observer.core.Event;

/**
 * create by zhegui on 2018/10/6
 */
public class MouseTest {

    public static void main(String[] args) {


        //将事件的注册分离，实现解耦
        try {
            Mouse mouse = new Mouse();
            mouse.click();

            MouseEventCallback callback = new MouseEventCallback();
            mouse.addListener(MouseEventType.ON_CLICK, callback, MouseEventCallback.class.getMethod("onClick", new Class[]{Event.class}));
            mouse.click();

            mouse.addListener(MouseEventType.ON_WHEEL, callback, MouseEventCallback.class.getMethod("onWheel",new Class[]{Event.class}));
            mouse.wheel();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
