package com.danirg10000gmail.template;

import android.util.Log;

import com.danirg10000gmail.template.common.GithubApiService;
import com.danirg10000gmail.template.common.model.Repository;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by DanielR on 02/07/2017.
 */

public class MainDataSource {

    GithubApiService mService;

    @Inject
    public MainDataSource(GithubApiService service) {
        mService = service;
    }

    public void getRepos(final MainPresenter.LoadReposCallback reposCallback){
        Log.d("dani", "getRepos: ");
        Call<List<Repository>> call = mService.getRepository("codepath");
        call.enqueue(new Callback<List<Repository>>() {
            @Override
            public void onResponse(Call<List<Repository>> call, Response<List<Repository>> response) {
                if (response.isSuccessful()){
                    Log.i("dani","success "+ response.body().toString());
                    List<Repository>list = response.body();
                    reposCallback.onsucces(list);
                }
            }
            @Override
            public void onFailure(Call<List<Repository>> call, Throwable t) {
                Log.i("dani","failure"+ String.valueOf(t.getMessage()));
            }
        });
    }

}
