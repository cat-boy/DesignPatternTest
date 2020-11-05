package demo.memento;

/**
 * @Title: Originator
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:26
 * @Version: 1.0
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
