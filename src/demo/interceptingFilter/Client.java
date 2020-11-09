package demo.interceptingFilter;

/**
 * @Title: Client
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/9 9:34
 * @Version: 1.0
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
