package demo.builder;

/**
 * @Title: Coke
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 15:10
 * @Version: 1.0
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
