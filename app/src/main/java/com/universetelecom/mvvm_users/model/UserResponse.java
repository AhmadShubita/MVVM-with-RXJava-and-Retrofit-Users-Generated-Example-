package com.universetelecom.mvvm_users.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by me on 8/1/17.
 */

public class UserResponse {

    @SerializedName("results") private List<User> userList;

    public List<User> getPeopleList () { return userList;}

    public void setPeopleList(List<User> mUserList) { this.userList = mUserList ;}

}
