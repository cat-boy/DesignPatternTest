package demo.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Broker
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/3 9:57
 * @Version: 1.0
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
