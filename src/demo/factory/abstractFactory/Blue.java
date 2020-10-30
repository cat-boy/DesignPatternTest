package demo.factory.abstractFactory;

/**
 * @Title: Blue
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 14:52
 * @Version: 1.0
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
