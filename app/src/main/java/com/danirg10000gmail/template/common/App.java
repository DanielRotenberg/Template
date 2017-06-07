package com.danirg10000gmail.template.common;

import android.app.Application;

import com.danirg10000gmail.template.BuildConfig;
import com.danirg10000gmail.template.common.debug.TimberDebugTree;
import com.danirg10000gmail.template.common.debug.TimberRealseTree;

import timber.log.Timber;

/**
 * Created by DanielR on 05/06/2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupDebuggingTools();
    }


    private void setupDebuggingTools(){
        if (BuildConfig.DEBUG){
            Timber.plant(new TimberDebugTree());
        } else{
            Timber.plant(new TimberRealseTree());
        }
    }


}
