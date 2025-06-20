package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 报名申请：(ApplicationForRegistration)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ApplicationForRegistration")
public class ApplicationForRegistration implements Serializable {

    // ApplicationForRegistration编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_for_registration_id")
    private Integer application_for_registration_id;

    // 导师账号
    @Basic
    private Integer tutor_account;
    // 导师姓名
    @Basic
    private String mentor_name;
    // 导师职称
    @Basic
    private String title_of_supervisor;
    // 学生账号
    @Basic
    private Integer student_account;
    // 学生姓名
    @Basic
    private String student_name;
    // 电话
    @Basic
    private String telephone;
    // 简历
    @Basic
    private String resume;
    // 学生研究方向
    @Basic
    private String student_research_direction;
    // 学生研究成果
    @Basic
    private String student_research_results;
    // 学生简介
    @Basic
    private String student_introduction;



    // 审核状态
    @Basic
    private String examine_state;








    // 审核回复
    @Basic
    private String examine_reply;



    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
