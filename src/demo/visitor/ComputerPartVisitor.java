package demo.visitor;


/**
 * @Title: ComputerPartVisitor
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:53
 * @Version: 1.0
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
