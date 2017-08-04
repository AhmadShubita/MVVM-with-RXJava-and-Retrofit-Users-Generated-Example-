package com.universetelecom.mvvm_users.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by me on 7/25/17.
 */

public class Login implements Serializable {

    @SerializedName("username") public String username;

    @SerializedName("password") public String password;

    @SerializedName("salt") public String salt;

    @SerializedName("md5") public String md5;

    @SerializedName("sha1") public String sha1;

    @SerializedName("sha256") public String sha256;


}
