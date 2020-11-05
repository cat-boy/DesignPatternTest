package demo.Facade;

/**
 * @Title: FacadePatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/30 16:47
 * @Version: 1.0
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
