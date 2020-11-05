package demo.mediator;

/**
 * @Title: MediatorPatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:23
 * @Version: 1.0
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
