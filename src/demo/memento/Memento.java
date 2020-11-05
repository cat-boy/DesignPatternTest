package demo.memento;

/**
 * @Title: Memento
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:25
 * @Version: 1.0
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}