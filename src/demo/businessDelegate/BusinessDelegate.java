package demo.businessDelegate;

/**
 * @Title: BusinessDelegate
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 10:34
 * @Version: 1.0
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
