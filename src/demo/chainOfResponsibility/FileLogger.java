package demo.chainOfResponsibility;

/**
 * @Title: FileLogger
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/3 9:02
 * @Version: 1.0
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
