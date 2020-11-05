package demo.Template;

/**
 * @Title: TemplatePatternDemo
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:49
 * @Version: 1.0
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
