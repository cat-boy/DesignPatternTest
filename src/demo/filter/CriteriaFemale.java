package demo.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: CriteriaFemale
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/29 10:06
 * @Version: 1.0
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
