package demo.interceptingFilter;

/**
 * @Title: DebugFilter
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/9 9:30
 * @Version: 1.0
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
