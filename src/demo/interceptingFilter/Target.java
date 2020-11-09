package demo.interceptingFilter;

/**
 * @Title: Target
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/9 9:30
 * @Version: 1.0
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
