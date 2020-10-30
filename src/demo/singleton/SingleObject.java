package demo.singleton;
/**
 * @Title: SingleObject
 * @Description: TODO 简单单例
 * @author: chenlh
 * @date: 2020/10/22 15:43
 * @Version: 1.0
 */
public class SingleObject {

    /***创建 SingleObject 的一个对象***/
    private static SingleObject instance = new SingleObject();

    /***让构造函数为 private，这样该类就不会被实例化***/
    private SingleObject(){}

    /***获取唯一可用的对象***/
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
