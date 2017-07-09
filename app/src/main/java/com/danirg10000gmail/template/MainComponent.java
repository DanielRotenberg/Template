package com.danirg10000gmail.template;

import com.danirg10000gmail.template.common.di.GithubRepositoryComponent;
import com.danirg10000gmail.template.common.di.MainModule;
import com.danirg10000gmail.template.common.di.PerActivity;

import dagger.Component;

/**
 * Created by DanielR on 02/07/2017.
 */
@PerActivity
@Component(dependencies = {GithubRepositoryComponent.class}, modules = {MainModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
