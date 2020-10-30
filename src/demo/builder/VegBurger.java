package demo.builder;

/**
 * @Title: VegBurger
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 15:09
 * @Version: 1.0
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
