package com.nsk.cit.slack.app.business;

import com.nsk.cit.slack.app.BuildConfig;
import com.nsk.cit.slack.app.entity.channel.ChannelWrapper;
import com.nsk.cit.slack.app.repository.network.ChannelNetwork;

/**
 * Created by eltonjhony on 15/05/16.
 */
public class ChannelBusiness {

    public ChannelWrapper retrieveChannels() {
        ChannelNetwork channelNetwork = new ChannelNetwork(BuildConfig.BASE_URL);
        // execute any business rule here!
        return channelNetwork.fetchChannels();
    }
}
