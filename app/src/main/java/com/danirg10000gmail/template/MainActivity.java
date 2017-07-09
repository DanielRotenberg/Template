package com.danirg10000gmail.template;

import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.danirg10000gmail.template.common.App;
import com.danirg10000gmail.template.common.GithubApiService;

import com.danirg10000gmail.template.common.di.MainModule;
import com.danirg10000gmail.template.common.model.Repository;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements MainContract.View {


    @Inject
    GithubApiService mService;

    @Inject
    MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder().githubRepositoryComponent(  ( (App)getApplication()).getGithubRepositoryComponent() )
                .mainModule(new MainModule(this)).build().inject(this);
       // DaggerGithubRepositoryComponent.builder().mainModule(new MainModule(this)).build().inject(this);





      //  Call <UserResponse> userResponseCall = mService.getUser("DanielRotenberg");
//        Call<List<Repository>> call = mService.getRepository("codepath");
//        call.enqueue(new Callback<List<Repository>>() {
//            @Override
//            public void onResponse(Call<List<Repository>> call, Response<List<Repository>> response) {
//                if (response.isSuccessful()){
//                    Log.i("dani","success "+ response.body().toString());
//                }
////                if (response.isSuccess()) {
////                    Log.i("DEBUG", response.body().toString());
////                    Snackbar.make(view,"Data retrieved", Snackbar.LENGTH_LONG)
////                            .setAction("Action",null).show();
////                } else {
////                    Log.i("ERROR", String.valueOf(response.code()));
////                }
//            }
//
//
//            @Override
//            public void onFailure(Call<List<Repository>> call, Throwable t) {
//                Log.i("dani","failure"+ String.valueOf(t.getMessage()));
//            }
//        });
        mPresenter.loadRepositories();
    }


    @Override
    public void showLog() {
        Log.d("dani", "showLog: presenter detecting view");
    }
}
