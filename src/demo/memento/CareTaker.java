package demo.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: CareTaker
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:27
 * @Version: 1.0
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
