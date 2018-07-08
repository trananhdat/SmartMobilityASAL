package com.example.admin.smartmobility.Common;


import com.example.admin.smartmobility.Remote.IGoogleAPI;
import com.example.admin.smartmobility.Remote.RetrofitClient;

/**
 * TAD
 * 3:50
 * 09/06/2018
 */

public class Common {
    public static final String baseURL = "https://map.googleapis.com";
    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
