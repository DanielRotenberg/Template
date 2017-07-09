package com.danirg10000gmail.template.common;

import com.danirg10000gmail.template.common.model.Repository;
import com.danirg10000gmail.template.common.model.RepositoryResponse;
import com.danirg10000gmail.template.common.model.UserResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by DanielR on 02/07/2017.
 */

public interface GithubApiService {

    @GET("/users/{username}")
    Call<UserResponse> getUser(
            @Path("username") String username
    );

    @GET("/users/{username}/repos")
    Call<List<RepositoryResponse>> getUsersRepositories(
            @Path("username") String username
    );

    @GET("/users/{user}/repos")
    Call<List<Repository>> getRepository(@Path("user") String userName);
}
