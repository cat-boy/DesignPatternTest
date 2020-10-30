package demo.singleton;

import jdk.internal.dynalink.beans.StaticClass;

/**
 * @Title: SingletonSync
 * @Description: TODO 懒汉式同步 加锁synchronized
 * @author: Administrator
 * @date: 2020/10/22 15:57
 * @Version: 1.0
 */
public class SingletonSync {
    /**
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：易
     * 优点：第一次调用才初始化，避免内存浪费。
     * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
     * */
    private  static  SingletonSync instance;
    private SingletonSync(){}
    public static synchronized SingletonSync getInstance(){
        if(instance == null){
           instance = new  SingletonSync();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
