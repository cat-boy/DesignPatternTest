package demo.strategy;

/**
 * @Title: Context
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:15
 * @Version: 1.0
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
