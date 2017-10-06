package com.example.sampleapplication;

import android.util.Log;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by other on 2017/10/05.
 */

public class QiitaApiUnitTest {

    @Test
    public void callApi() {

        System.err.println("callApi START --------------------------------------------");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://qiita.com/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        QiitaService service = retrofit.create(QiitaService.class);

        Response<List<Users>> results = null;

        try {

            results = service.getUsers().execute();

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (results.body() != null) {

            System.err.println(results.body().size());

            for (Users users : results.body()) {
                System.err.println(users.description);
                System.err.println(users.faceboo_id);
                System.err.println(users.followees_count);
                System.err.println(users.followers_count);
                System.err.println(users.github_login_name);
                System.err.println(users.id);
                System.err.println(users.items_count);
                System.err.println(users.linkedin_id);
                System.err.println(users.location);
                System.err.println(users.name);
                System.err.println(users.organization);
                System.err.println(users.permanent_id);
                System.err.println(users.profile_image_url);
                System.err.println(users.twitter_screen_name);
                System.err.println(users.website_url);
            }
        }

        System.err.println("callApi END   --------------------------------------------");
    }
}
