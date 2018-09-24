package pattern.singleton.test;

import pattern.singleton.HungrySingleton;
import pattern.singleton.LazySingleton;

import java.util.concurrent.CountDownLatch;

/**
 * create by zhegui on 2018/9/24
 */
public class HungryThreadSafeTest {

    public static void main(String[] args) {

        // 线程计数器
        //初始化为100
        // await 阻塞所有的线程，此时 之前的线程同时并发访问
        //没执行一次 countDown，计算器减一
        //当 countDown 计算器为0时  此时 之前的线程同时并发访问

        CountDownLatch latch = new CountDownLatch(100);

        for (int i=0; i<100; i++){
            new Thread(
                new Runnable(){
                    @Override
                    public void run() {
                        try {
                            latch.await();
                            //Object object = HungrySingleton.getInsatnce();
                            Object object = LazySingleton.getInstance();
                            System.out.println(System.currentTimeMillis() + ":" + object);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            ).start();
            //这里减一
            latch.countDown();
        }



    }
}
