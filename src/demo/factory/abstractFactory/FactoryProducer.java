package demo.factory.abstractFactory;

/**
 * @Title: FactoryProducer
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 14:59
 * @Version: 1.0
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
