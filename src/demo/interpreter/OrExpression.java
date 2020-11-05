package demo.interpreter;

/**
 * @Title: OrExpression
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 14:54
 * @Version: 1.0
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
