package com.universetelecom.mvvm_users.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.universetelecom.mvvm_users.model.User;
import com.universetelecom.mvvm_users.view.activity.UserDetailActivity;

/**
 * Created by Ahmad Shubita on 8/4/17.
 */

public class ItemUserViewModel extends BaseObservable {

    private User user;
    private Context context;

    public ItemUserViewModel(User user, Context context){
        this.user = user;
        this.context = context;
    }

    public String getProfileThumb() {
        return user.picture.medium;
    }

    // Loading Image using Glide Library.
    @BindingAdapter("imageUrl") public static void setImageUrl(ImageView imageView, String url){
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }

    public String getCell() { return user.cell; }

    public String getEmail() { return user.email; }

    public String getFullName() {

        user.fullName = user.name.title + "." + user.name.first + " " + user.name.last;

        return user.fullName;

    }

    public void onItemClick(View v){
        context.startActivity(UserDetailActivity.fillDetail(v.getContext(), user));
    }

    public void setUser(User user) {
        this.user = user;
        notifyChange();
    }
}
