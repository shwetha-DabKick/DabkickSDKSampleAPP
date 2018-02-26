package com.dabkick.sdk.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dabkick.videosdk.publicsettings.DabKick;
import com.dabkick.videosdk.publicsettings.DabKickVideoButton;
import com.dabkick.videosdk.publicsettings.DabKickVideoInfo;
import com.dabkick.videosdk.publicsettings.DabKickVideoProvider;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryVideoListingActivity extends AppCompatActivity {

    @BindView(R.id.video_list)ListView videosList;
    DabKickVideoInfo dabKickVideoInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_video_listing);
        ButterKnife.bind(this);

        final String category = getIntent().getExtras().getString("category");

        VideoListAdapter adapter = new VideoListAdapter(Util.getListBasedOnCategory(category),CategoryVideoListingActivity.this);
        videosList.setAdapter(adapter);

        videosList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                dabKickVideoInfo = Util.getListBasedOnCategory(category).get(i);
                VideoPlayer.dabKickVideoInfo = dabKickVideoInfo;
                Intent videoCategoryDisplay = new Intent(CategoryVideoListingActivity.this, VideoPlayer.class);
                startActivity(videoCategoryDisplay);

            }
        });
    }
}
