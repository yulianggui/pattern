package pattern.delegate.leader;

/**
 * create by zhegui on 2018/10/5
 */
public class Boss {


    //客户请求、委派者、被委派者
    //代理模式注重的是过程，委派模式注重的是结果，策略模式注重的是可扩展（外部扩展）
    //委派模式：就是静态代理和策略模式一种特殊的组合
    //
    public static void main(String[] args) {
        new Leader().doSomething("a");
        new Leader().doSomething("b");
    }
}
