package demo.factory.simpleFactory;

/**
 * @Title: Rectangle
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 14:30
 * @Version: 1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
