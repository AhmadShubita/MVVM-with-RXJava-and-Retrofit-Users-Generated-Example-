package com.universetelecom.mvvm_users.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Ahmad Shubita on 8/1/17.
 */

public class User implements Serializable {

    @SerializedName("gender") public String gender;

    @SerializedName("name") public Name name;

    @SerializedName("location") public Location location;

    @SerializedName("email") public String email;

    @SerializedName("login") public Login login;

    @SerializedName("phone") public String phone;

    @SerializedName("cell") public String cell;

    @SerializedName("picture") public Picture picture;

    public String fullName;

    public boolean hasEmail() {return email != null && !email.isEmpty();}
}
