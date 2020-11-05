package demo.visitor;

/**
 * @Title: Keyboard
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:54
 * @Version: 1.0
 */
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
