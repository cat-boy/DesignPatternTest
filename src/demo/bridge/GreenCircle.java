package demo.bridge;

/**
 * @Title: GreenCircle
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/28 15:36
 * @Version: 1.0
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
