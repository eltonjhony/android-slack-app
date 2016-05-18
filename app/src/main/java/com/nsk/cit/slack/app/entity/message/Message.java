package com.nsk.cit.slack.app.entity.message;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Message {

    private List<Attachment> attachments = new ArrayList<Attachment>();
    private String botId;
    private String subtype;
    private Object text;
    private String ts;
    private String type;
    private String user;

    /**
     *
     * @return
     * The attachments
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     *
     * @param attachments
     * The attachments
     */
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    /**
     *
     * @return
     * The botId
     */
    public String getBotId() {
        return botId;
    }

    /**
     *
     * @param botId
     * The bot_id
     */
    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     *
     * @return
     * The subtype
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     *
     * @param subtype
     * The subtype
     */
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /**
     *
     * @return
     * The text
     */
    public Object getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(Object text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The ts
     */
    public String getTs() {
        return ts;
    }

    /**
     *
     * @param ts
     * The ts
     */
    public void setTs(String ts) {
        this.ts = ts;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The user
     */
    public String getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(String user) {
        this.user = user;
    }

}