package com.example.myproject.pojo;

import com.baomidou.mybatisplus.annotations.TableName;
import com.example.myproject.base.MettreBaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 用户
 */
@Data
@Table(name = "t_user")
@Entity
@TableName("t_user")
public class Users extends MettreBaseEntity {

    private static final long serialVersionUID = 6772739839143166202L;

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "手机号")
    @Column(unique = true, nullable = false)
    private String phone;

    @ApiModelProperty(value = "密码")
    @Column(nullable = false)
    private String password;

    @ApiModelProperty(value = "年龄")
    private int age;

    @ApiModelProperty(value = "性别")
    private int sex;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "上次登录")
    private Date lastLogin;

    @ApiModelProperty(value = "身份类型")
    private int type;

    @ApiModelProperty(value = "token")
    private String token;
}
