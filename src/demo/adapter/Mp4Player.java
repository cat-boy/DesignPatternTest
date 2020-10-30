package demo.adapter;

/**
 * @Title: Mp4Player
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/10/26 11:32
 * @Version: 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
