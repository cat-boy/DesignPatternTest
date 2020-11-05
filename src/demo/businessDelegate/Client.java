package demo.businessDelegate;

/**
 * @Title: Client
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 10:35
 * @Version: 1.0
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
