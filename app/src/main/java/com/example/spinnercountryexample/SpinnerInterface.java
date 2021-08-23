package com.example.spinnercountryexample;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SpinnerInterface {
    String JSONURL = "https://www.testing.booklings.in/tha/api/";

    @GET("get_countries")
    Call<String> getJSONString();
}
