package demo.command;

/**
 * @Title: SellStock
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/3 9:56
 * @Version: 1.0
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.sell();
    }
}
