package demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Subject
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:32
 * @Version: 1.0
 */
public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
