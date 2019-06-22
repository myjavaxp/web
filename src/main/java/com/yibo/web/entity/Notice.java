package com.yibo.web.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Notice implements Serializable {
    private Integer id;

    private String title;

    private Date createDate;

    private Integer userId;

    private String content;

    private static final long serialVersionUID = 1L;
}