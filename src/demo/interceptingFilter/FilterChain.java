package demo.interceptingFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: FilterChain
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/9 9:31
 * @Version: 1.0
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
