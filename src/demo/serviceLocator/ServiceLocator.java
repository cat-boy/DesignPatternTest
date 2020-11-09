package demo.serviceLocator;

/**
 * @Title: ServiceLocator
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/9 9:41
 * @Version: 1.0
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
