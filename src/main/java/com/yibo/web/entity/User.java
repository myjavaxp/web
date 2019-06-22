package com.yibo.web.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private Integer id;

    private String loginName;

    private String password;

    private Integer status;

    private Date createDate;

    private String username;

    private static final long serialVersionUID = 1L;
}