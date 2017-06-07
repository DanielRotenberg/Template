package com.danirg10000gmail.template.common.debug;

import android.util.Log;

import timber.log.Timber;

/**
 * Created by DanielR on 06/06/2017.
 */

public class TimberRealseTree extends Timber.Tree {

    private static final int MAX_LOG_LENGTH = 4000;
    @Override
    protected boolean isLoggable(String tag, int priority) {
        if (priority == Log.INFO || priority == Log.DEBUG || priority == Log.VERBOSE){
            return false;
        }
        // Only log Waring, Error, wtf
        return true;
    }

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        if (isLoggable(tag,priority)){

            if (message.length()<MAX_LOG_LENGTH){
                if (priority==Log.ASSERT){
                    Log.wtf(tag,message);
                } else {
                    Log.println(priority,tag,message);
                }
                return;
            }


        }
    }
}
