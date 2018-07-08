package com.example.admin.smartmobility.Remote;

import retrofit2.http.GET;
import retrofit2.http.Url;
import retrofit2.Call;

/**
 * TAD
 * 09/07/2018
 */

public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String url);
}
