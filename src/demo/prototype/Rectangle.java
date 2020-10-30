package demo.prototype;

/**
 * @Title: Rectangle
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 15:25
 * @Version: 1.0
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
