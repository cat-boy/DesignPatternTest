package demo.filter;

import java.util.List;

/**
 * @Title: Criteria
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/29 10:05
 * @Version: 1.0
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
