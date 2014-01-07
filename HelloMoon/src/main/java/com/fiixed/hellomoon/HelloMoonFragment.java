package com.fiixed.hellomoon;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by abell on 1/7/14.
 */
public class HelloMoonFragment extends Fragment {

    private static final String TAG = "HelloMoonFragment";

    //    private AudioPlayer mPlayer = new AudioPlayer();
//    private Button mPlayButton;
//    private Button mPauseButton;
//    private Button mStopButton;
    private VideoView mVideoView;
    private Uri resourceUri = Uri.parse("android.resource://com.fiixed.hellomoon/raw/happy");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hello_moon, container, false);

//        mPlayButton = (Button)v.findViewById(R.id.hellomoon_playButton);
//        mPlayButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mPlayer.play(getActivity());
//            }
//        });
//        mPauseButton = (Button)v.findViewById(R.id.hellomoon_pauseButton);
//        mPauseButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mPlayer.paused();
//            }
//        });
//        mStopButton = (Button)v.findViewById(R.id.hellomoon_stopButton);
//        mStopButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mPlayer.stop();
//            }
//        });
        mVideoView = (VideoView) v.findViewById(R.id.videoView);
        Log.e(TAG, resourceUri.toString());
        mVideoView.setVideoURI(resourceUri);
        MediaController mediaController = new MediaController(getActivity());
        mediaController.setAnchorView(mVideoView);
        mVideoView.setMediaController(mediaController);
        mVideoView.start();
//


        return v;
    }

//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        mPlayer.stop();
//    }
}
