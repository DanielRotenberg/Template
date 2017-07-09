package com.danirg10000gmail.template.common.di;


import com.danirg10000gmail.template.MainDataSource;
import com.danirg10000gmail.template.common.App;
import com.danirg10000gmail.template.common.GithubApiService;


import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by DanielR on 02/07/2017.
 */
@Singleton
@Component(modules = {NetworkModule.class, DataSourceMudule.class})
public interface GithubRepositoryComponent {

    MainDataSource getDataSource();

    GithubApiService getService();


}
