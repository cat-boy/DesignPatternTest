package demo.strategy;

/**
 * @Title: OperationMultiply
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:14
 * @Version: 1.0
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
