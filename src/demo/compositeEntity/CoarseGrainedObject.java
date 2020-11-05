package demo.compositeEntity;

/**
 * @Title: CoarseGrainedObject
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 15:29
 * @Version: 1.0
 */
public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2){
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData(){
        return new String[] {do1.getData(),do2.getData()};
    }
}
