package demo.decorator;

/**
 * @Title: RedShapeDecorator
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/30 15:18
 * @Version: 1.0
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
