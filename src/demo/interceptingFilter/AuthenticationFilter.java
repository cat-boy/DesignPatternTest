package demo.interceptingFilter;

/**
 * @Title: AuthenticationFilter
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 15:42
 * @Version: 1.0
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
