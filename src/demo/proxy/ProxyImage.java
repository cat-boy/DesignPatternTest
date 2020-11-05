package demo.proxy;

/**
 * @Title: ProxyImage
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/3 8:41
 * @Version: 1.0
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
