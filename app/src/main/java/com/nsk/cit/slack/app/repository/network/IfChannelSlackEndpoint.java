package com.nsk.cit.slack.app.repository.network;

import com.nsk.cit.slack.app.entity.channel.ChannelWrapper;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by eltonjhony on 15/05/16.
 */
public interface IfChannelSlackEndpoint {

    @GET("channels/list")
    Call<ChannelWrapper> getChannelsList();
}
