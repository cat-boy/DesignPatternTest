package demo.Facade;

/**
 * @Title: Square
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/30 16:46
 * @Version: 1.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
