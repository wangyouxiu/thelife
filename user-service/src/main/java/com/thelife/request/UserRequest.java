package com.thelife.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserRequest implements Serializable {
    /**
     * 用户Id
     */
    private Integer id;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 电话
     */
    private String phone;
    /**
     * 头像
     */
    private String photo;

    private Date createTime;

    private Date modifiedTime;

}
