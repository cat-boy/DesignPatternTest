package demo.nullObject;

/**
 * @Title: RealCustomer
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 18:17
 * @Version: 1.0
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
