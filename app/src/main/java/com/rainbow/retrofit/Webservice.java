package com.rainbow.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by sugar on 9/17/2017.
 */

public interface Webservice {

    @GET("/post/{pk}")
    Call<Post> getPost(@Path("pk") int pk);
}
