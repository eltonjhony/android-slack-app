package com.nsk.cit.slack.app.entity.channel;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ChannelWrapper {

    private List<Channel> channels = new ArrayList<Channel>();
    private boolean ok;

    /**
     *
     * @return
     * The channels
     */
    public List<Channel> getChannels() {
        return channels;
    }

    /**
     *
     * @param channels
     * The channels
     */
    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    /**
     *
     * @return
     * The ok
     */
    public boolean isOk() {
        return ok;
    }

    /**
     *
     * @param ok
     * The ok
     */
    public void setOk(boolean ok) {
        this.ok = ok;
    }

}