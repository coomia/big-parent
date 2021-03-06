package com.bosssoft.bigdata.usercenter.api.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserGroupPrivate {
    private String guid;

    private String name;

    private String cname;

    private String shortName;

    private String code;

    private String parentId;

    private String createId;

    private Integer sortNo;

    private Integer isDelete;

    private Date createTime;

    private Date updateTme;

    private String createUser;

    private String createUserName;

    private String extend;

    private String description;

}