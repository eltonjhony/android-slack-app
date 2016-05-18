package com.nsk.cit.slack.app.entity.channel;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Channel {

    private int created;
    private String creator;
    private String id;
    private boolean isArchived;
    private boolean isChannel;
    private boolean isGeneral;
    private boolean isMember;
    private List<String> members = new ArrayList<String>();
    private String name;
    private int numMembers;
    private Purpose purpose;
    private Topic topic;

    /**
     *
     * @return
     * The created
     */
    public int getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    public void setCreated(int created) {
        this.created = created;
    }

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
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The isArchived
     */
    public boolean isIsArchived() {
        return isArchived;
    }

    /**
     *
     * @param isArchived
     * The is_archived
     */
    public void setIsArchived(boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     *
     * @return
     * The isChannel
     */
    public boolean isIsChannel() {
        return isChannel;
    }

    /**
     *
     * @param isChannel
     * The is_channel
     */
    public void setIsChannel(boolean isChannel) {
        this.isChannel = isChannel;
    }

    /**
     *
     * @return
     * The isGeneral
     */
    public boolean isIsGeneral() {
        return isGeneral;
    }

    /**
     *
     * @param isGeneral
     * The is_general
     */
    public void setIsGeneral(boolean isGeneral) {
        this.isGeneral = isGeneral;
    }

    /**
     *
     * @return
     * The isMember
     */
    public boolean isIsMember() {
        return isMember;
    }

    /**
     *
     * @param isMember
     * The is_member
     */
    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    /**
     *
     * @return
     * The members
     */
    public List<String> getMembers() {
        return members;
    }

    /**
     *
     * @param members
     * The members
     */
    public void setMembers(List<String> members) {
        this.members = members;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The numMembers
     */
    public int getNumMembers() {
        return numMembers;
    }

    /**
     *
     * @param numMembers
     * The num_members
     */
    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }

    /**
     *
     * @return
     * The purpose
     */
    public Purpose getPurpose() {
        return purpose;
    }

    /**
     *
     * @param purpose
     * The purpose
     */
    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    /**
     *
     * @return
     * The topic
     */
    public Topic getTopic() {
        return topic;
    }

    /**
     *
     * @param topic
     * The topic
     */
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}