package demo.mediator;

/**
 * @Title: User
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:22
 * @Version: 1.0
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}