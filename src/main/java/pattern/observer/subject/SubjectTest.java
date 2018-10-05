package pattern.observer.subject;

import pattern.observer.core.Event;
import pattern.observer.core.EventType;

/**
 * create by zhegui on 2018/10/6
 */
public class SubjectTest {

    public static void main(String[] args) {

        try {
            Subject subject = new Subject();
            subject.add();

            Observer observer = new Observer();
            //注册ADD的方法
            subject.addListener(EventType.ADD, observer, Observer.class.getMethod("advice", new Class[]{Event.class}));
            subject.add();
            subject.remove();

            //注册MOVE方法
            subject.addListener(EventType.MOVE, observer, Observer.class.getMethod("advice", new Class[]{Event.class}));
            subject.remove();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
