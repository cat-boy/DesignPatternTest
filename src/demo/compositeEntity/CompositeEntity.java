package demo.compositeEntity;

/**
 * @Title: CompositeEntity
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 15:29
 * @Version: 1.0
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
