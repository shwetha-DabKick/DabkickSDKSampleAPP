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
                "https://www.youtube.com/watch?v=ZfTZuWdFh7k");
        DabKickVideoInfo zeeNews = new DabKickVideoInfo("Zee News", "Nirav modi writes letter to PNB", "31800","https://img.youtube.com/vi/ED_m2X5m7yg/0.jpg",
                "https://www.youtube.com/watch?v=ED_m2X5m7yg");
        DabKickVideoInfo zeeBusiness = new DabKickVideoInfo("Zee Business", "Top 10 business news ", "101400","https://img.youtube.com/vi/8JV4DArZAy8/0.jpg",
                "https://www.youtube.com/watch?v=8JV4DArZAy8");
        DabKickVideoInfo businessLive = new DabKickVideoInfo("Singh", "Zee Business news Live", "263500","https://img.youtube.com/vi/S58CQ6N_8mE/0.jpg",
                "https://www.youtube.com/watch?v=S58CQ6N_8mE");
        DabKickVideoInfo cnbc = new DabKickVideoInfo("CNBC TV 18", "CNBC Live", "23215600","https://img.youtube.com/vi/saAyv8c2jmk/0.jpg",
                "https://www.youtube.com/watch?v=saAyv8c2jmk");
        DabKickVideoInfo bloomberg = new DabKickVideoInfo("Bloomberg", "BloomBerg Live", "2215600","https://img.youtube.com/vi/Ga3maNZ0x0w/0.jpg",
                "https://www.youtube.com/watch?v=Ga3maNZ0x0w");

        return new ArrayList<>(Arrays.asList(businessToday, zeeNews, zeeBusiness, businessLive, cnbc, bloomberg));

    }

    public static ArrayList<DabKickVideoInfo> getCartoonVideos(){

        DabKickVideoInfo krishna = new DabKickVideoInfo("Krishna", "Little Krishna", "1292700","https://img.youtube.com/vi/DVrSkd0s7Yg/0.jpg",
                "https://www.youtube.com/watch?v=DVrSkd0s7Yg");
        DabKickVideoInfo bean = new DabKickVideoInfo("Mister Bean", "new Mister Bean full episode", "312000","https://img.youtube.com/vi/okrIa7OtGJU/0.jpg",
                "https://www.youtube.com/watch?v=okrIa7OtGJU");
        DabKickVideoInfo flinstones = new DabKickVideoInfo("Bob Nelson", "Wacky Invenstions ", "54400","https://img.youtube.com/vi/3s-MnvKIqb8/0.jpg",
                "https://www.youtube.com/watch?v=3s-MnvKIqb8");
        DabKickVideoInfo hubbyresponsibilities = new DabKickVideoInfo("Boomerang official", "Hubby Responsibilities", "23300","https://img.youtube.com/vi/MMC-EkI_LHc/0.jpg",
                "https://www.youtube.com/watch?v=MMC-EkI_LHc");
        DabKickVideoInfo jonnie = new DabKickVideoInfo("jonnie", "Tom and Jerry", "30000","https://img.youtube.com/vi/jKzmUQuo9ls/0.jpg",
                "https://www.youtube.com/watch?v=jKzmUQuo9ls");
        DabKickVideoInfo justDucky = new DabKickVideoInfo("MovieCon", "Just Ducky", "65000","https://img.youtube.com/vi/n1gs_zh8zuM/0.jpg",
                "https://www.youtube.com/watch?v=n1gs_zh8zuM");
        DabKickVideoInfo schoolMouse = new DabKickVideoInfo("MovieCon", "Little School Mouse", "70900","https://img.youtube.com/vi/zxXKoMMxiRo/0.jpg",
                "https://www.youtube.com/watch?v=zxXKoMMxiRo");
        DabKickVideoInfo jumboJerry = new DabKickVideoInfo("MovieCon", "Jumbo and the Jerry", "70600","https://img.youtube.com/vi/MYNZjrWszT0/0.jpg",
                "https://www.youtube.com/watch?v=MYNZjrWszT0");
        DabKickVideoInfo tied = new DabKickVideoInfo("MovieCon", "Fit to be tied", "65600","https://img.youtube.com/vi/n4OFVR3V6G8/0.jpg",
                "https://www.youtube.com/watch?v=n4OFVR3V6G8");
        DabKickVideoInfo pup = new DabKickVideoInfo("MovieCon", "Jumbo and the JerryHic-cup pup", "62100","https://img.youtube.com/vi/9AzK6_7UPvU/0.jpg",
                "https://www.youtube.com/watch?v=9AzK6_7UPvU");

        return new ArrayList<>(Arrays.asList(krishna, bean, flinstones, hubbyresponsibilities, jonnie, justDucky,schoolMouse,jumboJerry, tied, pup));

    }

    public static ArrayList<DabKickVideoInfo> getFashionVideos(){

        DabKickVideoInfo mask = new DabKickVideoInfo("Erica Fernandes", "sulphur cooling mask", "20500","https://img.youtube.com/vi/ldOWJcG5eyE/0.jpg",
                //"https://www.youtube.com/watch?v=ldOWJcG5eyE");
                "http://qvc0.content.video.llnw.net/smedia/4826bb17d50c481b98a9e427e1c29c79/Y-/AwwQn_RUR5K0hivvTyecrE_Av5AHFfD0YaJ-RbrYU/a301149-18021616.mp4");
        DabKickVideoInfo shopping = new DabKickVideoInfo("Erica Fernandes", "Shopping Haul", "40300","https://img.youtube.com/vi/N9itVne50Nk/0.jpg",
                "https://www.youtube.com/watch?v=N9itVne50Nk");
        DabKickVideoInfo nykaaReview = new DabKickVideoInfo("Erica Fernandes", "Nykaa Cheeky Blush DUO", "20200","https://img.youtube.com/vi/J7CfUJiM1uw/0.jpg",
                "https://www.youtube.com/watch?v=J7CfUJiM1uw");
        DabKickVideoInfo blackHeads = new DabKickVideoInfo("Erica Fernandes", "BlackHeads", "102500","https://img.youtube.com/vi/lpb8DkbrgvQ/0.jpg",
                "https://www.youtube.com/watch?v=lpb8DkbrgvQ");
        DabKickVideoInfo hairFall = new DabKickVideoInfo("Erica Fernandes", "HairFall Rescue", "74400","https://img.youtube.com/vi/or1PrGxhgfM/0.jpg",
                "https://www.youtube.com/watch?v=or1PrGxhgfM");
        DabKickVideoInfo faceWash = new DabKickVideoInfo("Erica Fernandes", "Face Wash", "61000","https://img.youtube.com/vi/U-slXLrp8-U/0.jpg",
                "https://www.youtube.com/watch?v=U-slXLrp8-U");
        DabKickVideoInfo hairSerum = new DabKickVideoInfo("Erica Fernandes", "Hair Serum", "44900","https://img.youtube.com/vi/4mVsgwfuaPg/0.jpg",
                "https://www.youtube.com/watch?v=4mVsgwfuaPg");
        DabKickVideoInfo eyeCream = new DabKickVideoInfo("Erica Fernandes", "Eye Cream", "43200","https://img.youtube.com/vi/yUKFHaT4DTU/0.jpg",
                "https://www.youtube.com/watch?v=yUKFHaT4DTU");
        DabKickVideoInfo tutorial = new DabKickVideoInfo("Erica Fernandes", "Makeup tutorial", "214600","https://img.youtube.com/vi/dt0oVfkGQNI/0.jpg",
                "https://www.youtube.com/watch?v=dt0oVfkGQNI");
        DabKickVideoInfo smokyEyehack = new DabKickVideoInfo("Erica Fernandes", "Smoky Eye Hack", "84200","https://img.youtube.com/vi/oIhNDpsG_xA/0.jpg",
                "https://www.youtube.com/watch?v=oIhNDpsG_xA");

        return new ArrayList<>(Arrays.asList(mask, shopping, nykaaReview, blackHeads, hairFall, faceWash,hairSerum,eyeCream, tutorial, smokyEyehack));

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

        final ArrayList<String> videoCategories = new ArrayList<>(Arrays.asList(getCategories()));
        final Map<String, ArrayList<DabKickVideoInfo>> videoHolder = new LinkedHashMap<>();

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
