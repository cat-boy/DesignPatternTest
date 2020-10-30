package demo.bridge;

/**
 * @Title: Shape
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/28 15:36
 * @Version: 1.0
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
