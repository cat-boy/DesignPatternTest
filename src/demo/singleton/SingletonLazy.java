package demo.singleton;

/**
 * @Title: SingletonLazy
 * @Description: TODO 懒汉式，加载时新建
 * @author: Administrator
 * @date: 2020/10/22 15:48
 * @Version: 1.0
 */
public class SingletonLazy {
    /**
     * 是否 Lazy 初始化：是
     * 是否多线程安全：否
     * 实现难度：易
     * **/
    private static SingletonLazy instance;
    private SingletonLazy(){}
    public static  SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
