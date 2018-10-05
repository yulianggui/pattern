package pattern.decorator;

/**
 * create by zhegui on 2018/10/5
 */
public class RedPen implements IPen{

    protected IPen pen;

    public RedPen(IPen pen) {
        this.pen = pen;
    }

    @Override
    public void picture() {
        pen.picture();
    }

    public void redPicture(){
        System.out.println("我可以画出红色的画！");
    }
}
