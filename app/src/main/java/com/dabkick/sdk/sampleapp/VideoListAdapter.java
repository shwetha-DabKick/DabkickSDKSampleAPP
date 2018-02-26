package com.dabkick.sdk.sampleapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dabkick.videosdk.publicsettings.DabKickVideoInfo;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by iFocus on 23-02-2018.
 */

public class VideoListAdapter extends BaseAdapter {

    ArrayList<DabKickVideoInfo> data;
    Context mCtx;

    public VideoListAdapter(ArrayList<DabKickVideoInfo> data, Context ctx) {
        //super(context, resource);
        this.data = data;
        mCtx = ctx;
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public DabKickVideoInfo getItem(int position) {

        return data.get(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View row = convertView;
        if (row == null) {

            row = LayoutInflater.from(mCtx).inflate(R.layout.video_list_adapter, null);

        } else {

            row = convertView;
        }

        ImageView img = (ImageView) row.findViewById(R.id.thumbnail);
        TextView title = (TextView) row.findViewById(R.id.title);
        TextView author = (TextView) row.findViewById(R.id.author);

        title.setText(getItem(position).getTitle());
        author.setText(getItem(position).getAuthorName());

        Picasso.with(mCtx)
                .load(getItem(position).getThumbnailUrl())
                .into(img);


        return row;
    }

}
