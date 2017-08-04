package com.universetelecom.mvvm_users.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by me on 7/25/17.
 */

public class Location implements Serializable {

    @SerializedName("street") public String street;

    @SerializedName("city") public String city;

    @SerializedName("state") public String state;

    @SerializedName("postcode") public String postcode;

}
