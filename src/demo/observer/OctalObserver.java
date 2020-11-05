package demo.observer;

/**
 * @Title: OctalObserver
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:49
 * @Version: 1.0
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
