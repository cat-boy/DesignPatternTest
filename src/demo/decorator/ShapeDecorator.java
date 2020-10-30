package demo.decorator;

/**
 * @Title: ShapeDecorator
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/30 15:18
 * @Version: 1.0
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
