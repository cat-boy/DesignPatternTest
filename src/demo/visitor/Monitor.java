package demo.visitor;

/**
 * @Title: Monitor
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:54
 * @Version: 1.0
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
