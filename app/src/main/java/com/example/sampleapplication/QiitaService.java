package com.example.sampleapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by other on 2017/10/05.
 */

public interface QiitaService {

    @GET("users")
    Call<List<Users>> getUsers();
}
