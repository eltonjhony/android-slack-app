package com.nsk.cit.slack.app.entity.message;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class MessageWrapper {

    private boolean hasMore;
    private boolean isLimited;
    private List<Message> messages = new ArrayList<Message>();
    private boolean ok;
    private int unreadCountDisplay;

    /**
     *
     * @return
     * The hasMore
     */
    public boolean isHasMore() {
        return hasMore;
    }

    /**
     *
     * @param hasMore
     * The has_more
     */
    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    /**
     *
     * @return
     * The isLimited
     */
    public boolean isIsLimited() {
        return isLimited;
    }

    /**
     *
     * @param isLimited
     * The is_limited
     */
    public void setIsLimited(boolean isLimited) {
        this.isLimited = isLimited;
    }

    /**
     *
     * @return
     * The messages
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     *
     * @param messages
     * The messages
     */
    public void setMessages(List<Message> messages) {
        this.messages = messages;
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

    /**
     *
     * @return
     * The unreadCountDisplay
     */
    public int getUnreadCountDisplay() {
        return unreadCountDisplay;
    }

    /**
     *
     * @param unreadCountDisplay
     * The unread_count_display
     */
    public void setUnreadCountDisplay(int unreadCountDisplay) {
        this.unreadCountDisplay = unreadCountDisplay;
    }

}