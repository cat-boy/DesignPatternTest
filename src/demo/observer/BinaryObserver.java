package demo.observer;

/**
 * @Title: BinaryObserver
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:47
 * @Version: 1.0
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
