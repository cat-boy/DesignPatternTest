package demo.observer;

/**
 * @Title: HexaObserver
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:52
 * @Version: 1.0
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
