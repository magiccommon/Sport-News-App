package com.example.sportnews.api;

import com.example.sportnews.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("everything")
    Call<News> getNews(

            @Query("q") String keyword,
            @Query("language") String language,
            @Query("domains") String domains,
            @Query("sortBy") String sortBy,
            @Query("pageSize") Integer pageSize,
            @Query("apiKey") String apiKey

    );
}
