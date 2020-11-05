package demo.businessDelegate;

/**
 * @Title: JMSService
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 10:33
 * @Version: 1.0
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
