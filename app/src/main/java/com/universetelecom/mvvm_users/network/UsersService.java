package com.universetelecom.mvvm_users.network;

import com.universetelecom.mvvm_users.model.UserResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Ahmad Shubita on 8/1/17.
 */

public interface UsersService {

    @GET
    Observable<UserResponse> fetchUsers(@Url String url);
}
