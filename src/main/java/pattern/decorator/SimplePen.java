package pattern.decorator;

/**
 * create by zhegui on 2018/10/5
 */
public class SimplePen implements IPen{
    @Override
    public void picture() {
        System.out.println("我只是一只普通的笔！");
    }
}
