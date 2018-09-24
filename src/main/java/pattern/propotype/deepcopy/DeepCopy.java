package pattern.propotype.deepcopy;

import pattern.propotype.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 深度复制，解决浅复制的弊端
 *    使用序列化方式，更高效
 * create by zhegui on 2018/9/24
 */
public class DeepCopy implements Cloneable, Serializable{

    //序列化版本号，作为反序列化的标志
    private static final long serialVersionUID = 3660175623550807131L;

    private String myName;

    private List<String> list;

    private Student stu;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        System.out.println("正在克隆中.....");

        DeepCopy clone = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            clone = (DeepCopy)ois.readObject();


        } catch (Exception e) {
            try {
                if(oos != null){
                    oos.close();
                }
                if(bos != null){
                    bos.close();
                }
                if(ois != null){
                    ois.close();
                }
                if(bis != null){
                    bis.close();
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }


        return clone;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("测试深度克隆模式：");

        DeepCopy p = new DeepCopy();
        p.setMyName("test");
        Student stu = new Student();
        stu.setHeigth(12.3);
        stu.setHobby("打球");
        stu.setSex(15);
        p.setStu(stu);
        List<String> list = new ArrayList<>();
        list.add("String1");
        list.add("String2");
        p.setList(list);

        DeepCopy clone = (DeepCopy) p.clone();


        System.out.println("原型和拷贝对象地址是否一致："+(p == clone));
        System.out.println("原型和拷贝的Studetn地址是否一致:"+(p.getStu() == clone.getStu()));
        System.out.println("原型和拷贝的list地址是否一致:"+(p.getList() == clone.getList()));
        System.out.println("原型和拷贝的myName值是否一致:"+(p.getMyName().equals(clone.getMyName())));

        System.out.println("修改拷贝对象中的值");
        clone.getList().add("String3");
        clone.getStu().setHobby("旅游");
        System.out.println("原对象与拷贝对象的数组的长度是否："+(p.getList().size() == clone.getList().size()));

        System.out.println(p.getStu().getHobby());
        System.out.println(clone.getStu().getHobby());
    }
}
