package demo.bridge;

/**
 * @Title: BridgePatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/28 15:39
 * @Version: 1.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
