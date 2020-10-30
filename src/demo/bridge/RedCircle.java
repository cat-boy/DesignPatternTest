package demo.bridge;

/**
 * @Title: RedCircle
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/28 15:35
 * @Version: 1.0
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
