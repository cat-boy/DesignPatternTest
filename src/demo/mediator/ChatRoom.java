package demo.mediator;

import java.util.Date;

/**
 * @Title: ChatRoom
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/4 17:22
 * @Version: 1.0
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
