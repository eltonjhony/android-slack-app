package com.nsk.cit.slack.app.entity.message;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Attachment {

    private String color;
    private String fallback;
    private int id;
    private List<String> mrkdwnIn = new ArrayList<String>();
    private String pretext;
    private String text;
    private String title;
    private String titleLink;

    /**
     *
     * @return
     * The color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     * The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     * The fallback
     */
    public String getFallback() {
        return fallback;
    }

    /**
     *
     * @param fallback
     * The fallback
     */
    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    /**
     *
     * @return
     * The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The mrkdwnIn
     */
    public List<String> getMrkdwnIn() {
        return mrkdwnIn;
    }

    /**
     *
     * @param mrkdwnIn
     * The mrkdwn_in
     */
    public void setMrkdwnIn(List<String> mrkdwnIn) {
        this.mrkdwnIn = mrkdwnIn;
    }

    /**
     *
     * @return
     * The pretext
     */
    public String getPretext() {
        return pretext;
    }

    /**
     *
     * @param pretext
     * The pretext
     */
    public void setPretext(String pretext) {
        this.pretext = pretext;
    }

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The titleLink
     */
    public String getTitleLink() {
        return titleLink;
    }

    /**
     *
     * @param titleLink
     * The title_link
     */
    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

}