package com.yibo.web.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Document implements Serializable {
    private Integer id;

    private String title;

    private String filename;

    private String remark;

    private Date createDate;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}