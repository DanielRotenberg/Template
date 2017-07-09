package com.danirg10000gmail.template;

import android.util.Log;

import com.danirg10000gmail.template.common.model.Repository;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by DanielR on 02/07/2017.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;
    private MainDataSource mDataSource;

    @Inject
    public MainPresenter(MainContract.View view, MainDataSource dataSource) {
        mView = view;
        mDataSource = dataSource;
    }

    @Override
    public void loadRepositories() {
        Log.d("dani", "loadRepositories: ");
       // mView.showLog();
        mDataSource.getRepos(mCallback);
    }

 private LoadReposCallback mCallback = new LoadReposCallback(){

     @Override
     public void onsucces(List<Repository> response) {
         Log.d("dani", "onsucces: in presenter callback");
     }

     @Override
     public void onFailure(Exception e) {

     }
 };

    interface LoadReposCallback{
        void onsucces(List<Repository>response);

        void onFailure(Exception e);

    }
}
