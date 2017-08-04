package com.universetelecom.mvvm_users.app;

import android.app.Application;
import android.content.Context;

import com.universetelecom.mvvm_users.network.ApiFactory;
import com.universetelecom.mvvm_users.network.UsersService;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Ahmad Shubita on 8/1/17.
 */

public class AppController extends Application {

    private UsersService usersService;
    private Scheduler scheduler;

    private static AppController get(Context context) {
        return (AppController) context.getApplicationContext();
    }

    public static AppController create(Context context) {
        return AppController.get(context);
    }

    public UsersService getUserService() {
        if (usersService == null) {
            usersService = ApiFactory.create();
        }

        return usersService;
    }

    public Scheduler subscribeScheduler() {
        if (scheduler == null) {
            scheduler = Schedulers.io();
        }

        return scheduler;
    }

    public void setUserService(UsersService usersService) {
        this.usersService = usersService;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

}
