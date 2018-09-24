package pattern.propotype;

import java.io.Serializable;

/**
 * create by zhegui on 2018/9/24
 */
public class Student implements Serializable{

    private static final long serialVersionUID = -6960537305175497338L;

    private int sex;

    private String hobby;

    private double heigth;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
}

