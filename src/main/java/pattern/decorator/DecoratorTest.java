package pattern.decorator;

/**
 * create by zhegui on 2018/10/5
 */
public class DecoratorTest {

    public static void main(String[] args) {

        SimplePen simplePen = new SimplePen();
        System.out.println("简单的画！");
        simplePen.picture();

        RedPen redPen = new RedPen(simplePen);
        System.out.println("红色的画！");
        redPen.picture();
        redPen.redPicture();

        MoreColorPen moreColorPen = new MoreColorPen(redPen);
        System.out.println("彩色的画！");
        moreColorPen.picture();
        moreColorPen.redPicture();
        moreColorPen.moreColorPicture();

    }
}
