package demo.nullObject;

/**
 * @Title: NullCustomer
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 18:18
 * @Version: 1.0
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
