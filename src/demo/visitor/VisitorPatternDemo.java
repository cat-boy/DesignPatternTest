package demo.visitor;

/**
 * @Title: VisitorPatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:58
 * @Version: 1.0
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
