package com.example.myproject.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.example.myproject.base.MettreBaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 收货地址
 */
@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "t_address")
@TableName("t_address")
public class Address extends MettreBaseEntity {

    @ApiModelProperty(value = "邮寄姓名")
    private String name;

    @Version
    private Integer version;

    @ApiModelProperty(value = "省份")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "区县")
    private String county;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "是否默认")
    private boolean defaults;

    @ApiModelProperty(value = "用户id", hidden = true)
    private String userId;
}
