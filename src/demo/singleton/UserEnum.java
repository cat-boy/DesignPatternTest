package demo.singleton;

/**
 * @Title: User
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/22 17:33
 * @Version: 1.0
 */
public class UserEnum {
    /****私有化构造函数***/
    private UserEnum(){ }

    /****定义一个静态枚举类***/
    static enum SingletonEnum{
        /***创建一个枚举对象，该对象天生为单例***/
        INSTANCE;
        private UserEnum user;
        /***私有化枚举的构造函数***/
        private SingletonEnum(){
            user=new UserEnum();
        }
        public UserEnum getInstance(){
            return user;
        }
    }

    /***对外暴露一个获取User对象的静态方法***/
    public static UserEnum getInstance(){
        return SingletonEnum.INSTANCE.getInstance();
    }
}
