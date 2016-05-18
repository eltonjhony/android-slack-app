package com.nsk.cit.slack.app.entity.user;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class UserWrapper {

    private int cacheTs;
    private List<Member> members = new ArrayList<Member>();
    private boolean ok;

    /**
     *
     * @return
     * The cacheTs
     */
    public int getCacheTs() {
        return cacheTs;
    }

    /**
     *
     * @param cacheTs
     * The cache_ts
     */
    public void setCacheTs(int cacheTs) {
        this.cacheTs = cacheTs;
    }

    /**
     *
     * @return
     * The members
     */
    public List<Member> getMembers() {
        return members;
    }

    /**
     *
     * @param members
     * The members
     */
    public void setMembers(List<Member> members) {
        this.members = members;
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