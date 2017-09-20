package com.sitimulyaningsih.moviecorn;

/**
 * Created by Asus p450l on 05/09/2017.
 */

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieApiService {
        @GET("movie/top_rated")
        Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

        @GET("movie/popular")
        Call<MovieResponse> getPopularMovies(@Query("api_key") String apiKey);

        @GET("movie/now_playing")
        Call<MovieResponse> getNowPlayingMovies(@Query("api_key") String apiKey);


        @GET("movie/{id}")
        Call<MovieResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}