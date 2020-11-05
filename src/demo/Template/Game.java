package demo.Template;

/**
 * @Title: Game
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 9:47
 * @Version: 1.0
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
