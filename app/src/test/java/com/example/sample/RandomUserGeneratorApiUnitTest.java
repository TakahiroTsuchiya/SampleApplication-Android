package com.example.sample;

import com.example.sample.api.random_user_generator.RandomUserGeneratorService;
import com.example.sample.api.random_user_generator.model.Info;
import com.example.sample.api.random_user_generator.model.Random;
import com.example.sample.api.random_user_generator.model.Result;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by takahirotsuchiya on 2017/10/15.
 */

public class RandomUserGeneratorApiUnitTest {

    @Test
    public void callApi() {

        System.err.println("callApi START --------------------------------------------");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RandomUserGeneratorService.END_POINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RandomUserGeneratorService service = retrofit.create(RandomUserGeneratorService.class);

        Response<Random> results = null;

        try {

            results = service.getDefault().execute();

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (results.body() != null) {

            for (Result result : results.body().results) {
                System.err.println(result.name.title);
                System.err.println(result.name.first);
                System.err.println(result.name.last);
            }

            Info info = results.body().info;
            if (info != null) {
                System.err.println(info.results);
                System.err.println(info.page);
                System.err.println(info.version);
            }
        }

        System.err.println("callApi END   --------------------------------------------");
    }
}
