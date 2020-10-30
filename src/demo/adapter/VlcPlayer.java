package demo.adapter;

/**
 * @Title: VlcPlayer
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/26 11:29
 * @Version: 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
