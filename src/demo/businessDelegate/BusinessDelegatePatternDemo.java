package demo.businessDelegate;

/**
 * @Title: BusinessDelegatePatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 14:27
 * @Version: 1.0
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
