package demo.command;

/**
 * @Title: Stock
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/3 9:53
 * @Version: 1.0
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }
}
