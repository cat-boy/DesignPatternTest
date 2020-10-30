package demo.singleton;

/**
 * @Title: SingletonEnum
 * @Description: TODO 枚举
 * @author: Administrator
 * @date: 2020/10/22 17:28
 * @Version: 1.0
 */
public enum SingletonEnum {
    INSTANCE;
    public SingletonEnum getInstance(){
        return INSTANCE;
    }
}
