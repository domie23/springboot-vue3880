package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 导师信息：(MentorInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "MentorInformation")
public class MentorInformation implements Serializable {

    // MentorInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentor_information_id")
    private Integer mentor_information_id;

    // 导师照片
    @Basic
    private String tutor_photo;
    // 导师账号
    @Basic
    private Integer tutor_account;
    // 导师姓名
    @Basic
    private String mentor_name;
    // 导师职称
    @Basic
    private String title_of_supervisor;
    // 研究方向
    @Basic
    private String research_direction;
    // 个人介绍
    @Basic
    private String personal_introduction;
    // 招生计划
    @Basic
    private String enrollment_plan;
    // 研究成果
    @Basic
    private String research_findings;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
