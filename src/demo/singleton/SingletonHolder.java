package demo.singleton;

/**
 * @Title: SingletonInner
 * @Description: TODO 登记式/静态内部类
 * @author: Administrator
 * @date: 2020/10/22 16:47
 * @Version: 1.0
 */
public class SingletonHolder {
    /**
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：一般
     * classloader 机制来保证初始化 instance 时只有一个线程
     * */
    private static class SingletonInner {
        private static final SingletonHolder INSTANCE = new SingletonHolder();

        private SingletonInner() {
        }
    }

    private SingletonHolder() {
    }

    public static SingletonHolder getInstance() {
        return SingletonInner.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
