package demo.interceptingFilter;

/**
 * @Title: InterceptingFilterDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/9 9:35
 * @Version: 1.0
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
