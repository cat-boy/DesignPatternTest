package demo.builder;

/**
 * @Title: ColdDrink
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 15:08
 * @Version: 1.0
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
