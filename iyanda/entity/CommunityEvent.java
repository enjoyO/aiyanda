package com.iyanda.entity;

import java.util.Date;

public class CommunityEvent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_communityevent.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_communityevent.CommunityID
     *
     * @mbggenerated
     */
    private String communityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_communityevent.EventContent
     *
     * @mbggenerated
     */
    private String eventcontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_communityevent.Date
     *
     * @mbggenerated
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_communityevent.ID
     *
     * @return the value of t_communityevent.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_communityevent.ID
     *
     * @param id the value for t_communityevent.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_communityevent.CommunityID
     *
     * @return the value of t_communityevent.CommunityID
     *
     * @mbggenerated
     */
    public String getCommunityid() {
        return communityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_communityevent.CommunityID
     *
     * @param communityid the value for t_communityevent.CommunityID
     *
     * @mbggenerated
     */
    public void setCommunityid(String communityid) {
        this.communityid = communityid == null ? null : communityid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_communityevent.EventContent
     *
     * @return the value of t_communityevent.EventContent
     *
     * @mbggenerated
     */
    public String getEventcontent() {
        return eventcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_communityevent.EventContent
     *
     * @param eventcontent the value for t_communityevent.EventContent
     *
     * @mbggenerated
     */
    public void setEventcontent(String eventcontent) {
        this.eventcontent = eventcontent == null ? null : eventcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_communityevent.Date
     *
     * @return the value of t_communityevent.Date
     *
     * @mbggenerated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_communityevent.Date
     *
     * @param date the value for t_communityevent.Date
     *
     * @mbggenerated
     */
    public void setDate(Date date) {
        this.date = date;
    }
}