package demo.prototype;

/**
 * @Title: Circle
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 15:26
 * @Version: 1.0
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
