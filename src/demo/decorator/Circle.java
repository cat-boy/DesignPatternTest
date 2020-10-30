package demo.decorator;

/**
 * @Title: Circle
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/30 15:17
 * @Version: 1.0
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
