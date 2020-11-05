package demo.nullObject;

/**
 * @Title: CustomerFactory
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 18:18
 * @Version: 1.0
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
