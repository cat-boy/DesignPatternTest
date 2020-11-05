package demo.command;

/**
 * @Title: BuyStock
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/3 9:55
 * @Version: 1.0
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.buy();
    }
}
