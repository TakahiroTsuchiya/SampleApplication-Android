package com.example.sample.api.random_user_generator;

import com.example.sample.api.random_user_generator.model.Random;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by takahirotsuchiya on 2017/10/15.
 */

public interface RandomUserGeneratorService {

    public static final String END_POINT = "https://randomuser.me/";

    @GET("api")
    Call<Random> getDefault();
}
