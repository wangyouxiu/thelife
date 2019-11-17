package com.record.thelife.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (UserGroup)实体类
 *
 * @author makejava
 * @since 2019-11-17 13:02:42
 */
public class UserGroup implements Serializable {
    private static final long serialVersionUID = -77776305441908597L;
    /**
    * 组Id
    */
    private Integer groupId;
    /**
    * 组名
    */
    private String groupName;
    /**
    * 组头像
    */
    private String groupPhoto;
    /**
    * 所有者
    */
    private Integer ownerId;
    /**
    * 成员id
    */
    private String crewId;
    /**
    * 简介
    */
    private String intro;
    /**
    * 通知公告
    */
    private String notice;
    
    private Date createTime;
    
    private Date modifiedTime;


    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupPhoto() {
        return groupPhoto;
    }

    public void setGroupPhoto(String groupPhoto) {
        this.groupPhoto = groupPhoto;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getCrewId() {
        return crewId;
    }

    public void setCrewId(String crewId) {
        this.crewId = crewId;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

}