package demo.factory.simpleFactory;

/**
 * @Title: Circle
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 14:32
 * @Version: 1.0
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
