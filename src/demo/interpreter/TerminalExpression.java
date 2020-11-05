package demo.interpreter;

/**
 * @Title: TerminalExpression
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 14:52
 * @Version: 1.0
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
