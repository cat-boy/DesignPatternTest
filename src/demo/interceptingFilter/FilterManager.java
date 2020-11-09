package demo.interceptingFilter;

/**
 * @Title: FilterManager
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/9 9:32
 * @Version: 1.0
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
