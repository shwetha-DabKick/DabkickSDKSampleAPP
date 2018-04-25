package com.dabkick.sdk.sampleapp;

import com.dabkick.videosdk.publicsettings.DabKickVideoInfo;
import com.dabkick.videosdk.publicsettings.DabKickVideoProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by iFocus on 23-02-2018.
 */

public class Util {

    public static String[] getCategories(){

        String[] categories = new String[] { "Business",
                "Cartoon",
                "Fashion",
                "Jewellery",
                "News",
                "Health and Fitness",
                "Entertainment",
                "Yoga",
                "Tech"
        };

        return categories;
    }

    public static ArrayList<DabKickVideoInfo> getBusinessVideos(){

        DabKickVideoInfo businessToday = new DabKickVideoInfo("Business Today", "Redmi note 5 pro goes on sale", "22700","https://img.youtube.com/vi/ZfTZuWdFh7k/0.jpg",
                "https://www.myprovence.fr/snapshots2012/medias/videos/introSnaphots.mp4");
        DabKickVideoInfo zeeNews = new DabKickVideoInfo("Zee News", "Nirav modi writes letter to PNB", "31800","https://img.youtube.com/vi/ED_m2X5m7yg/0.jpg",
                "https://www.myprovence.fr/snapshots2012/medias/videos/02-GareSt-Charles.mp4");
        DabKickVideoInfo zeeBusiness = new DabKickVideoInfo("Zee Business", "Top 10 business news ", "101400","https://img.youtube.com/vi/8JV4DArZAy8/0.jpg",
                "https://www.myprovence.fr/snapshots2012/medias/videos/03-LecercledesNageurs.mp4");

        return new ArrayList<>(Arrays.asList(businessToday, zeeNews, zeeBusiness));

    }

    public static ArrayList<DabKickVideoInfo> getCartoonVideos(){

        DabKickVideoInfo krishna = new DabKickVideoInfo("Krishna", "Little Krishna", "1292700","https://img.youtube.com/vi/DVrSkd0s7Yg/0.jpg",
                "https://www.myprovence.fr/snapshots2012/medias/videos/06-LesCalanques.mp4");
        DabKickVideoInfo bean = new DabKickVideoInfo("Singh", "Zee Business news Live", "263500","https://img.youtube.com/vi/S58CQ6N_8mE/0.jpg",
                "https://www.myprovence.fr/snapshots2012/medias/videos/04-LeVieux-port.mp4");
        DabKickVideoInfo flinstones = new DabKickVideoInfo("CNBC TV 18", "CNBC Live", "23215600","https://img.youtube.com/vi/saAyv8c2jmk/0.jpg",
                "https://www.myprovence.fr/snapshots2012/medias/videos/05-LeGrandPortMaritime.mp4");

        return new ArrayList<>(Arrays.asList(krishna, bean, flinstones));

    }

    public static ArrayList<DabKickVideoInfo> getFashionVideos(){

        DabKickVideoInfo mask = new DabKickVideoInfo("Erica Fernandes", "sulphur cooling mask", "20500","https://img.youtube.com/vi/ldOWJcG5eyE/0.jpg",
                "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4");
        DabKickVideoInfo shopping = new DabKickVideoInfo("Erica Fernandes", "Shopping Haul", "40300","https://img.youtube.com/vi/N9itVne50Nk/0.jpg",
                "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4");
        DabKickVideoInfo nykaaReview = new DabKickVideoInfo("Erica Fernandes", "Nykaa Cheeky Blush DUO", "20200","https://img.youtube.com/vi/J7CfUJiM1uw/0.jpg",
                "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4");

        return new ArrayList<>(Arrays.asList(mask, shopping, nykaaReview));

    }

    public static ArrayList<DabKickVideoInfo> getListBasedOnCategory(String category){

        switch(category){

            case "Business":
                return getBusinessVideos();

            case "Cartoon":

                return getCartoonVideos();

            case "Fashion":
                return getFashionVideos();

                default:
                    return  getBusinessVideos();
        }

    }

    public static DabKickVideoProvider createDabKickVideoProvider(final DabKickVideoInfo selectedVideoInfo) {

        // video categories setup
        final ArrayList<String> videoCategories = new ArrayList<>(Arrays.asList(getCategories()));

        // VideoHolder hashes category-to-videolist
        final Map<String, ArrayList<DabKickVideoInfo>> videoHolder = new LinkedHashMap<>();

        //construct 3 groups of videos
        videoHolder.put(getCategories()[0], getBusinessVideos());
        videoHolder.put(getCategories()[1], getCartoonVideos());
        videoHolder.put(getCategories()[2], getFashionVideos());

         return new DabKickVideoProvider() {
            @Override
            public ArrayList<DabKickVideoInfo> provideVideos(String category, int offset) {
                int totalSize = videoHolder.get(category).size();
                int endIndex = Math.min(totalSize, offset + 3);
                ArrayList<DabKickVideoInfo> list = new ArrayList<>(videoHolder.get(category).subList(offset, endIndex));
                return list;
            }

            @Override
            public ArrayList<String> provideCategories(int offset) {
                if (offset == videoCategories.size()) {
                    // cannot provide any more video categories
                    return new ArrayList<>();
                }
                int endIndex = Math.min(videoCategories.size(), offset + 5);
                ArrayList<String> categoryList = new ArrayList<>(videoCategories.subList(offset, endIndex));
                return categoryList;
            }

            @Override
            public ArrayList<DabKickVideoInfo> startDabKickWithVideos() {
                ArrayList<DabKickVideoInfo> smallerList = new ArrayList<>();
                if (selectedVideoInfo != null) {
                    smallerList.add(selectedVideoInfo);
                }
                return smallerList;
            }
        };
    }

    public static ArrayList<CategoriesDetailsHolder> getCategoriesDetailHolder(){

        CategoriesDetailsHolder item = new CategoriesDetailsHolder(Util.getCategories()[0], "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuF5taKtuFoZJtZYBs1QSgxHOvVVTEILID6KhEIui5wlWMQA90");
        CategoriesDetailsHolder item1 = new CategoriesDetailsHolder(Util.getCategories()[1], "https://img.youtube.com/vi/3s-MnvKIqb8/0.jpg");
        CategoriesDetailsHolder item2 = new CategoriesDetailsHolder(Util.getCategories()[2], "https://img.youtube.com/vi/lpb8DkbrgvQ/0.jpg");
        CategoriesDetailsHolder item3 = new CategoriesDetailsHolder(Util.getCategories()[3], "https://img.youtube.com/vi/7NWOsYFvDNs/0.jpg");
        CategoriesDetailsHolder item4 = new CategoriesDetailsHolder(Util.getCategories()[4], "https://img.youtube.com/vi/wJYcoukIzg0/0.jpg");
        CategoriesDetailsHolder item5 = new CategoriesDetailsHolder(Util.getCategories()[5], "https://img.youtube.com/vi/cVRnZa3_ing/0.jpg");
        CategoriesDetailsHolder item6 = new CategoriesDetailsHolder(Util.getCategories()[6], "https://pbs.twimg.com/profile_images/905430692804182016/Zw_3RFTn_400x400.jpg");
        CategoriesDetailsHolder item7 = new CategoriesDetailsHolder(Util.getCategories()[7], "https://img.youtube.com/vi/cnKZit6VB44/0.jpg");
        CategoriesDetailsHolder item8 = new CategoriesDetailsHolder(Util.getCategories()[8], "https://img.youtube.com/vi/mn6Ia5e_suY/0.jpg");

        return new ArrayList<>(Arrays.asList(item,item1,item2,item3,item4,item5,item6,item7,item8));

    }
}
