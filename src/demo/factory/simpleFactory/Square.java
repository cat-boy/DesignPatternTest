package demo.factory.simpleFactory;

/**
 * @Title: Square
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 14:31
 * @Version: 1.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
