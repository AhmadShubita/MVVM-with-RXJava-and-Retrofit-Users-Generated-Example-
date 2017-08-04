package com.universetelecom.mvvm_users.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.universetelecom.mvvm_users.utils.Constant.BASE_URL;

/**
 * Created by Ahmad Shubita on 8/1/17.
 */

public class ApiFactory {

    public static UsersService create() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(UsersService.class);
    }

}
