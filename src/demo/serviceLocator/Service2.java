package demo.serviceLocator;

/**
 * @Title: Service2
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/9 9:38
 * @Version: 1.0
 */
public class Service2 implements Service {
    @Override
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
