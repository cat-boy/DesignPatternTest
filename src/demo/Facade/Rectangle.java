package demo.Facade;

/**
 * @Title: Rectangle
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/30 16:46
 * @Version: 1.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
