package pattern.decorator;

import java.io.DataInputStream;
import java.io.InputStream;

/**
 * create by zhegui on 2018/10/5
 */
public class MoreColorPen extends RedPen implements IPen{

    public MoreColorPen(IPen pen) {
        super(pen);
    }

    @Override
    public void picture() {
        pen.picture();
    }

    public void moreColorPicture(){
        System.out.println("我可以画出彩色的画！");
    }

}
