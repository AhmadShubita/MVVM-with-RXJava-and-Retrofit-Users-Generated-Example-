package com.universetelecom.mvvm_users.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Ahmad Shubita on 7/25/17.
 */

public class Picture implements Serializable {

    @SerializedName("large") public String large;

    @SerializedName("medium") public String medium;

    @SerializedName("thumbnail") public String thumbnail;
}
