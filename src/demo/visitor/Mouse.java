package demo.visitor;

/**
 * @Title: Mouse
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:55
 * @Version: 1.0
 */
public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
