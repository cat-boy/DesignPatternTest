package demo.builder;

/**
 * @Title: ChickenBurger
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 15:09
 * @Version: 1.0
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
