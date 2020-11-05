package demo.compositeEntity;

/**
 * @Title: CompositeEntityPatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 15:30
 * @Version: 1.0
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
