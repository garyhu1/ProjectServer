package com.example.myproject.pojo;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单子项
 */
@Data
@Entity
@Table(name = "t_order_item")
@TableName("t_order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "订单子表id", hidden = true)
    private Long orderItemId;

    @ApiModelProperty(value = "订单编号", hidden = true)
    private Long orderId;

    @ApiModelProperty(value = "商品id", hidden = true)
    private Long goodsId;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "生成订单的商品单价")
    private BigDecimal goodsPrice;

    @ApiModelProperty(value = "订单项商品数量")
    private int goodsNumber;

    @ApiModelProperty(value = "订单项总价")
    private BigDecimal totalPrice;

    @CreatedDate
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间", hidden = true)
    private Date creationTime = new Date();

    @LastModifiedDate
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新时间", hidden = true)
    private Date lastUpdate = new Date();

}
