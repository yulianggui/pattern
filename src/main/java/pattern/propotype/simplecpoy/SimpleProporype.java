package pattern.propotype.simplecpoy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * 浅克隆，如果是引用类型，会使得原对象和拷贝对象
 *    引用属性的地址是一样的，这样不管是原对象或是
 *    引用对象的 引用属性的内容改变，都会有影响
 *
 * JDK 推荐的克隆模式
 *    实现Cloneable接口，重写clone方法
 *      使用默认的clone就是浅拷贝
 * create by zhegui on 2018/9/24
 */
public class SimpleProporype implements Cloneable{


    private String name;

    private List<String> list;

    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("我被调用了，正在进行拷贝中。。。。");
        return super.clone();
    }

    public static void main(String[] args) {
        System.out.println("浅拷贝测试。。。。");

        SimpleProporype p = new SimpleProporype();
        p.setName("zhegui");
        p.setDate(new Date(System.currentTimeMillis()));
        List<String> list = new ArrayList<>();
        list.add("String1");
        list.add("String2");
        p.setList(list);


        try {
            SimpleProporype clone = (SimpleProporype) p.clone();
            System.out.println("原对象与拷贝对象是否是同一个对象："+ (p == clone));
            System.out.println("原对象与拷贝对象的name是否一样："+p.getName() +":"+ clone.getName()
                    +"  地址："+(p.getName() == clone.getName()));
            System.out.println("原对象与拷贝对象的日期地址是否一样："+(p.getDate() == clone.getDate())
                    +";值"+p.getDate() + ":"+clone.getDate());
            System.out.println("原对象与拷贝对象的数组地址是否一样："+(p.getList() == clone.getList()));

            System.out.println("尝试修改拷贝对象的List的值会怎么样");
            Thread.sleep(1000);
            clone.getList().add("String3");

            System.out.println("原对象与拷贝对象的数组的长度是否："+(p.getList().size() == clone.getList().size()));
            System.out.println(p.getList().get(2));
            System.out.println(clone.getList().get(2));

            //可以看到，这个对拷贝对象的list属性进行改动，原对象的list也收到影响，应为他们的引用地址是一样的
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

    }
}
