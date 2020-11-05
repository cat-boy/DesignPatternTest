package demo.state;

/**
 * @Title: StopState
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 18:08
 * @Version: 1.0
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
    @Override
    public String toString(){
        return "Stop State";
    }
}
