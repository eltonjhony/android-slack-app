package com.nsk.cit.slack.app.repository.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by eltonjhony on 15/05/16.
 */
public class BaseNetwork {

    protected final Retrofit mRetrofit;

    public BaseNetwork(String mBaseUrl) {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
