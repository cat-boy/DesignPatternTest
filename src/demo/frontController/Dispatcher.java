package demo.frontController;

/**
 * @Title: Dispatcher
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 15:36
 * @Version: 1.0
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
