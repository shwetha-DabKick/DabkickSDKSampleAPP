package com.dabkick.sdk.sampleapp;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import com.dabkick.videosdk.publicsettings.DabKick;
import com.dabkick.videosdk.publicsettings.DabKickVideoInfo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.categories_list)RecyclerView categoriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setTitle("Categories");

        //does not work without callback
        //DabKick.register(MainActivity.this,  null);

      /*  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, Util.getCategories());

        categoriesList.setAdapter(adapter);

        categoriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent videoCategoryDisplay = new Intent(MainActivity.this, CategoryVideoListingActivity.class);
                videoCategoryDisplay.putExtra("position", position);
                startActivity(videoCategoryDisplay);
            }
        });*/

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(
                this, 2, LinearLayoutManager.VERTICAL, false);
        categoriesList.setLayoutManager(layoutManager);

        CategoriesAdapter adapter = new CategoriesAdapter(this, Util.getCategoriesDetailHolder(),
                new CategoriesAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(CategoriesDetailsHolder categoryInfo) {
                        Intent videoCategoryDisplay = new Intent(MainActivity.this, CategoryVideoListingActivity.class);
                        videoCategoryDisplay.putExtra("category", categoryInfo.getCategory());
                        startActivity(videoCategoryDisplay);
                    }
                });
        categoriesList.setAdapter(adapter);
    }
}
