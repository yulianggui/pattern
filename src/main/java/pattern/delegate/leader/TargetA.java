package pattern.delegate.leader;

/**
 * create by zhegui on 2018/10/5
 */
public class TargetA implements ITarget{

    @Override
    public void doSomething(String command) {
        System.out.println("我是员工A，领导叫我搬砖了！...." + command);
    }
}
