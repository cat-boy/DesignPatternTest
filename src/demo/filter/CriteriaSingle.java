package demo.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: CriteriaSingle
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/29 10:07
 * @Version: 1.0
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
