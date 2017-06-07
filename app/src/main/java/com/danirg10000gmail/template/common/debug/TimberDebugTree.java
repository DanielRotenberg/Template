package com.danirg10000gmail.template.common.debug;

import timber.log.Timber;

/**
 * Created by DanielR on 06/06/2017.
 */

public class TimberDebugTree extends Timber.DebugTree {
    @Override
    protected String createStackElementTag(StackTraceElement element) {
        return super.createStackElementTag(element)+ " : " + element.getLineNumber();
    }
}
