package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 学生信息：(StudentInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "StudentInformation")
public class StudentInformation implements Serializable {

    // StudentInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_information_id")
    private Integer student_information_id;

    // 学生照片
    @Basic
    private String student_photos;
    // 学生账号
    @Basic
    private Integer student_account;
    // 学生姓名
    @Basic
    private String student_name;
    // 学生学号
    @Basic
    private String student_no;
    // 性别
    @Basic
    private String gender;
    // 年龄
    @Basic
    private String age;
    // 学院名称
    @Basic
    private String college_name;
    // 班级名称
    @Basic
    private String class_name;
    // 入学年份
    @Basic
    private String enrollment_year;
    // 电话
    @Basic
    private String telephone;
    // 研究成果
    @Basic
    private String research_findings;
    // 研究方向
    @Basic
    private String research_direction;
    // 个人简介
    @Basic
    private String personal_introduction;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
