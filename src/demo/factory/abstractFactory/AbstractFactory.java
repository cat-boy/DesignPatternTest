package demo.factory.abstractFactory;

/**
 * @Title: AbstractFactory
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 14:52
 * @Version: 1.0
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
