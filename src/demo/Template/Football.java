package demo.Template;

/**
 * @Title: Football
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:48
 * @Version: 1.0
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
