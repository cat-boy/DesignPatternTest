package demo.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: CriteriaMale
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/29 10:06
 * @Version: 1.0
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
