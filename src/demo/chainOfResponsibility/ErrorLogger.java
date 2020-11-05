package demo.chainOfResponsibility;

/**
 * @Title: ErrorLogger
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/3 9:01
 * @Version: 1.0
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
