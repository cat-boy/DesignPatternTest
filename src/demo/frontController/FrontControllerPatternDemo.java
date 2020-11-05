package demo.frontController;

/**
 * @Title: FrontControllerPatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 15:38
 * @Version: 1.0
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
