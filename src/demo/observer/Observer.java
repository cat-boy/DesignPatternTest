package demo.observer;

/**
 * @Title: Observer
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:32
 * @Version: 1.0
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
