package demo.businessDelegate;

/**
 * @Title: EJBService
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 10:32
 * @Version: 1.0
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
