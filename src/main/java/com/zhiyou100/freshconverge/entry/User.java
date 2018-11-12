package com.zhiyou100.freshconverge.entry;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //用户名 密码
    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    //手机号  邮箱
    @Column(name = "phone_num")
    private String phoneNum;
    @Column(name = "email")
    private String email;

    //注册时间
    @Column(name = "regist_time")
    private Date registTime;


}
