package pattern.observer.mouse;

import pattern.observer.core.Event;

/**
 * create by zhegui on 2018/10/6
 */
public class MouseEventCallback {

    public void onClick(Event event){
        System.out.println("触发了鼠标单击事件！");
        System.out.println(event);
        System.out.println("鼠标单击事件逻辑结束！");
    }

    public void onDoubleClick(Event event){
        System.out.println("触发了鼠标双击事件！");
        System.out.println(event);
        System.out.println("鼠标双击事件逻辑结束！");
    }

    public void onUp(Event event){
        System.out.println("触发了鼠标弹起事件！");
        System.out.println(event);
        System.out.println("鼠标弹起事件逻辑结束！");
    }

    public void onDown(Event event){
        System.out.println("触发了鼠标按下事件！");
        System.out.println(event);
        System.out.println("鼠标按下事件逻辑结束！");
    }

    public void onWheel(Event event){
        System.out.println("触发了鼠标滚动事件！");
        System.out.println(event);
        System.out.println("鼠标滚动事件逻辑结束！");
    }

    public void onMove(Event event){
        System.out.println("触发了鼠标移动事件！");
        System.out.println(event);
        System.out.println("鼠标移动事件逻辑结束！");
    }

    public void onOver(Event event){
        System.out.println("触发了鼠标悬停事件！");
        System.out.println(event);
        System.out.println("鼠标悬停事件逻辑结束！");
    }
}
