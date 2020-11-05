package demo.state;

/**
 * @Title: Context
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 18:08
 * @Version: 1.0
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
