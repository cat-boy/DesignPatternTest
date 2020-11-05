package demo.observer;

/**
 * @Title: ObserverPatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:53
 * @Version: 1.0
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
