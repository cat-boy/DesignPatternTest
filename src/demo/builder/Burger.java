package demo.builder;

/**
 * @Title: Burger
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 15:08
 * @Version: 1.0
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
