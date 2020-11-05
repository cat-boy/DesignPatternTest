package demo.businessDelegate;

/**
 * @Title: BusinessLookUp
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 10:33
 * @Version: 1.0
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
