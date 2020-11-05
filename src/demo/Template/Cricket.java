package demo.Template;

/**
 * @Title: Cricket
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:48
 * @Version: 1.0
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
