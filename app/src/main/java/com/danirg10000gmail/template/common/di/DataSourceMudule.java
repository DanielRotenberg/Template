package com.danirg10000gmail.template.common.di;

import com.danirg10000gmail.template.MainDataSource;
import com.danirg10000gmail.template.common.GithubApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DanielR on 02/07/2017.
 */
@Module
public class DataSourceMudule {

    @Provides
    @Singleton
    public MainDataSource provideMainDataSource(GithubApiService service) {
        return new MainDataSource(service);
    }
}
