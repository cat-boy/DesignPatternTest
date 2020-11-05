package demo.command;

/**
 * @Title: CommandPatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/3 9:58
 * @Version: 1.0
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
