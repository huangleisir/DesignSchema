package com.zhj.desigin.ActionModel.command.demo1;

/**
 * Created by zhanghongjun on 16/10/20.
 */
public class StopCommand implements command{
    MediaPlayer mediaPlayer;

    public void setMediaPlayer(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void execute() {
        mediaPlayer.stop();
    }
}
