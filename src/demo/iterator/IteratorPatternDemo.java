package demo.iterator;

/**
 * @Title: IteratorPatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 16:48
 * @Version: 1.0
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
