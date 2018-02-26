package com.dabkick.sdk.sampleapp;

/**
 * Created by iFocus on 25-02-2018.
 */

public class CategoriesDetailsHolder {

    String category;
    String thumbnail;

    CategoriesDetailsHolder(String category, String thumbnail){

        setCategory(category);
        setThumbnail(thumbnail);

    }

    public void setCategory(String category){

        this.category = category;

    }

    public String getCategory(){

        return category;
    }

    public void setThumbnail(String thumbnail){

        this.thumbnail = thumbnail;
    }

    public String getThumbnail(){

        return thumbnail;
    }
}
