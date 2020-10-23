package demo.builder;

/**
 * @Title: Pepsi
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/23 15:10
 * @Version: 1.0
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
