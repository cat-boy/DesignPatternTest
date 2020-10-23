package demo.factory.abstractFactory;

/**
 * @Title: Red
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 14:51
 * @Version: 1.0
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
