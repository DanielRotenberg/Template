package com.danirg10000gmail.template.common.di;

import com.danirg10000gmail.template.MainContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DanielR on 02/07/2017.
 */
@PerActivity
@Module
public class MainModule {

   private MainContract.View mView;

    public MainModule(MainContract.View view) {
        mView = view;
    }

    @Provides
    public MainContract.View provideView() {
        return mView;
    }
}
