package com.fiixed.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by abell on 1/7/14.
 */
public class AudioPlayer {

    private MediaPlayer mPlayer;

    public void stop() {
        if(mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void paused() {
        if(!mPlayer.isPlaying()) {
            mPlayer.start();
            return;
        }
        mPlayer.pause();
    }

    public void play(Context c) {
        stop();
        mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
        mPlayer.start();
    }
}
