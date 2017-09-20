package com.sitimulyaningsih.moviecorn;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Asus p450l on 06/09/2017.
 */

public class ApiClient {

    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static String url_findById(int id){
        return "https://api.themoviedb.org/3/movie/"+id+"?api_key=46181937d85419d81f75290d2bf7d598";
    }
}
