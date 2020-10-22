package demo.singleton;

/**
 * @Title: SingletonHungry
 * @Description: TODO 饿汉式
 * @author: Administrator
 * @date: 2020/10/22 16:05
 * @Version: 1.0
 */
public class SingletonHungry {
    /**
     * 是否 Lazy 初始化：否
     * 是否多线程安全：是
     * 实现难度：易
     * 优点：没有加锁，执行效率会提高。
     * 缺点：类加载时就初始化，浪费内存。
     * */
    private static  SingletonHungry instance = new SingletonHungry();
    private SingletonHungry(){}
    public static SingletonHungry getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
