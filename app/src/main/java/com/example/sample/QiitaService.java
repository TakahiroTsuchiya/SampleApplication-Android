package com.example.sample;

import com.example.sample.api.qiita.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by other on 2017/10/05.
 */

public interface QiitaService {

    public static final String END_POINT = "https://qiita.com/api/v2/";

    @GET("users")
    Call<List<Users>> getUsers();
}
