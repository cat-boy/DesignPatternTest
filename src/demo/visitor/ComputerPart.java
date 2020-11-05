package demo.visitor;

/**
 * @Title: ComputerPart
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:53
 * @Version: 1.0
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
