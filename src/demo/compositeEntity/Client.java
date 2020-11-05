package demo.compositeEntity;

/**
 * @Title: Client
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 15:29
 * @Version: 1.0
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}
