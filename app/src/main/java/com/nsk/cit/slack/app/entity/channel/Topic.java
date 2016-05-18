package com.nsk.cit.slack.app.entity.channel;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Topic {

    private String creator;
    private int lastSet;
    private String value;

    /**
     *
     * @return
     * The creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     *
     * @param creator
     * The creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     *
     * @return
     * The lastSet
     */
    public int getLastSet() {
        return lastSet;
    }

    /**
     *
     * @param lastSet
     * The last_set
     */
    public void setLastSet(int lastSet) {
        this.lastSet = lastSet;
    }

    /**
     *
     * @return
     * The value
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @param value
     * The value
     */
    public void setValue(String value) {
        this.value = value;
    }

}