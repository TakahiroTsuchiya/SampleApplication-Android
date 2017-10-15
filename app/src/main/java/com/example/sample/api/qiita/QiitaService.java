package com.example.sample.api.qiita;

import com.example.sample.api.qiita.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by other on 2017/10/05.
 */

public interface QiitaService {

    public static final String END_POINT = "https://qiita.com/api/v2/";

    @GET("users")
    Call<List<Users>> getUsers();

    @GET("users/:user_id")
    Call<Users> getUserDetail(@Query("user_id") String userId);

}
