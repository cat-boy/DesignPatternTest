package demo.singleton;

/**
 * @Title: SingletonDCL
 * @Description: TODO 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @author: Administrator
 * @date: 2020/10/22 16:26
 * @Version: 1.0
 */
public class SingletonDcl {
    /**
     * JDK 版本：JDK1.5 起
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * 实现难度：较复杂
     * 指令重排序会影响到
     * */
    private volatile static SingletonDcl instance ;
    private SingletonDcl(){}
    public static SingletonDcl getInstance(){
        if(instance == null){
            synchronized(SingletonDcl.class){
                if(instance ==null){
                    instance = new SingletonDcl();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
