package pattern.observer.mouse;

import pattern.observer.core.EventListener;

import java.awt.event.MouseListener;

/**
 * create by zhegui on 2018/10/6
 */
public class Mouse extends EventListener{

    public void click(){
        System.out.println("鼠标点击！");
        this.trigger(MouseEventType.ON_CLICK);
    }

    public void doubleClick(){
        System.out.println("鼠标双击击！");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

    public void up(){
        System.out.println("鼠标弹起！");
        this.trigger(MouseEventType.ON_UP);
    }

    public void down(){
        System.out.println("鼠标按下！");
        this.trigger(MouseEventType.ON_DOWN);
    }

    public void wheel(){
        System.out.println("鼠标滚动！");
        this.trigger(MouseEventType.ON_WHEEL);
    }

    public void move(){
        System.out.println("鼠标移动！");
        this.trigger(MouseEventType.ON_MOVE);
    }

    public void over(){
        System.out.println("鼠标悬停！");
        this.trigger(MouseEventType.ON_OVER);
    }
}
