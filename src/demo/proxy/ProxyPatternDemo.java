package demo.proxy;

/**
 * @Title: ProxyPatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/3 8:43
 * @Version: 1.0
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
