package demo.singleton;

import java.util.Date;

/**
 * @Title: SingleObject
 * @Description: TODO 单例
 * @author: chenlh
 * @date: 2020/10/22 15:43
 * @Version: 1.0
 */
public class SingletonMain {
    /**
     * 1、单例类只能有一个实例。
     * 2、单例类必须自己创建自己的唯一实例。
     * 3、单例类必须给所有其他对象提供这一实例。
     * **/
    public static void main(String[] args) {

        Date start = new Date();
        for (int i = 0; i < 100; i++) {
            //获取唯一可用的对象
            SingleObject object = SingleObject.getInstance();
            //显示消息
           // object.showMessage();
        }
        System.out.println(new StringBuffer("Object运行时间为").append(System.currentTimeMillis()-start.getTime()));

        Date start1 = new Date();
        for (int i = 0; i < 100; i++) {
            //获取唯一可用的对象
            SingletonSync singletonSync = SingletonSync.getInstance();
            //显示消息
            //singletonSync.showMessage();
        }
        System.out.println(new StringBuffer("singletonSync运行时间为").append(System.currentTimeMillis()-start1.getTime()));

        Date start2 = new Date();
        for (int i = 0; i < 100; i++) {
            //获取唯一可用的对象
            SingletonDcl singletonDcl = SingletonDcl.getInstance();
            //显示消息
           // singletonDcl.showMessage();
        }
        System.out.println(new StringBuffer("singletonDcl运行时间为").append(System.currentTimeMillis()-start2.getTime()));

        Date start3 = new Date();
        for (int i = 0; i < 100; i++) {
            //获取唯一可用的对象
            SingletonHungry singletonHungry = SingletonHungry.getInstance();
            //显示消息
            //singletonHungry.showMessage();
        }
        System.out.println(new StringBuffer("singletonHungry运行时间为").append(System.currentTimeMillis()-start3.getTime()));

        Date start4 = new Date();
        for (int i = 0; i < 100; i++) {
            //获取唯一可用的对象
            SingletonLazy singletonLazy = SingletonLazy.getInstance();
            //显示消息
            //singletonLazy.showMessage();
        }
        System.out.println(new StringBuffer("singletonLazy运行时间为").append(System.currentTimeMillis()-start4.getTime()));
        Date start5 = new Date();
        for (int i = 0; i < 100; i++) {
            //获取唯一可用的对象
            SingletonHolder singletonHolder = SingletonHolder.getInstance();
            //显示消息
            //singletonLazy.showMessage();
        }
        System.out.println(new StringBuffer("singletonHolder运行时间为").append(System.currentTimeMillis()-start5.getTime()));


    }
}
