package demo.factory.abstractFactory;

/**
 * @Title: Square
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 14:50
 * @Version: 1.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
