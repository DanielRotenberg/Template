package com.danirg10000gmail.template.common;

import android.app.Application;
import android.util.Log;

import com.danirg10000gmail.template.BuildConfig;
import com.danirg10000gmail.template.common.debug.TimberDebugTree;
import com.danirg10000gmail.template.common.debug.TimberRealseTree;
//import com.danirg10000gmail.template.common.di.DaggerGithubRepositoryComponent;
import com.danirg10000gmail.template.common.di.DaggerGithubRepositoryComponent;
import com.danirg10000gmail.template.common.di.GithubRepositoryComponent;

import timber.log.Timber;

/**
 * Created by DanielR on 05/06/2017.
 */

public class App extends Application {

    private GithubRepositoryComponent mGithubRepositoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDebuggingTools();
        mGithubRepositoryComponent = DaggerGithubRepositoryComponent.builder().build();

        Log.d("dani", "onCreate: "+(mGithubRepositoryComponent!=null));
    }

    public GithubRepositoryComponent getGithubRepositoryComponent() {
        return mGithubRepositoryComponent;
    }

    private void setupDebuggingTools() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new TimberDebugTree());
        } else {
            Timber.plant(new TimberRealseTree());
        }
    }


}
