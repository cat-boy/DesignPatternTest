package demo.state;

/**
 * @Title: StatePatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 18:09
 * @Version: 1.0
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}