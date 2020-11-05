package demo.state;

/**
 * @Title: StartState
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 18:07
 * @Version: 1.0
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    @Override
    public String toString(){
        return "Start State";
    }
}
