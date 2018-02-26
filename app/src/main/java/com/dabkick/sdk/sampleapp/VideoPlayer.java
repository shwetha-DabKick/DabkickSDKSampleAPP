package com.dabkick.sdk.sampleapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.dabkick.videosdk.livesession.videoview.DkVideoView;
import com.dabkick.videosdk.publicsettings.DabKick;
import com.dabkick.videosdk.publicsettings.DabKickVideoButton;
import com.dabkick.videosdk.publicsettings.DabKickVideoInfo;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoPlayer extends Activity {

    @BindView(R.id.fragment_watch_video_video_view)
    DkVideoView videoView;
    public static DabKickVideoInfo dabKickVideoInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_video_player);
        ButterKnife.bind(this);

        videoView.setOnPreparedListener(new OnPreparedListener() {
            @Override
            public void onPrepared() {
                videoView.start();
            }
        });
        videoView.setVideoPath(dabKickVideoInfo.getVideoUrl());

        DabKickVideoButton button = findViewById(R.id.dabkick_video_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DabKick.setVideoProvider(Util.createDabKickVideoProvider(dabKickVideoInfo));
                DabKick.watchWithFriends(VideoPlayer.this);
            }
        });
    }

    @Override
    public void onStop() {
        super.onStop();
        videoView.pause();
    }
}
