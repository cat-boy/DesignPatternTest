package demo.bridge;

/**
 * @Title: Circle
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/28 15:37
 * @Version: 1.0
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
