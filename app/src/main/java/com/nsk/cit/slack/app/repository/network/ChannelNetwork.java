package com.nsk.cit.slack.app.repository.network;

import android.util.Log;
import java.io.IOException;
import com.nsk.cit.slack.app.entity.channel.ChannelWrapper;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by eltonjhony on 15/05/16.
 */
public class ChannelNetwork extends BaseNetwork {

    public ChannelNetwork(String mBaseUrl) {
        super(mBaseUrl);
    }

    public ChannelWrapper fetchChannels() {
        IfChannelSlackEndpoint apiService = mRetrofit.create(IfChannelSlackEndpoint.class);
        Call<ChannelWrapper> callback = apiService.getChannelsList();
        try {
            Response<ChannelWrapper> response = callback.execute();
            return response.body();
        } catch (IOException e) {
            Log.e("IOException", e.getMessage());
        }
        return null;
    }
}
