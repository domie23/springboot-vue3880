package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 导师用户：(MentorUser)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "MentorUser")
public class MentorUser implements Serializable {

    // MentorUser编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentor_user_id")
    private Integer mentor_user_id;

    // 导师账号
    @Basic
    private String tutor_account;
    // 导师姓名
    @Basic
    private String mentor_name;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
