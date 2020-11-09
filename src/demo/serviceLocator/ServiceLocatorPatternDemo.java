package demo.serviceLocator;

/**
 * @Title: ServiceLocatorPatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/9 9:41
 * @Version: 1.0
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
