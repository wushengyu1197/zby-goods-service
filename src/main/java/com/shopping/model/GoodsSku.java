package com.shopping.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("goods_sku")
public class GoodsSku {

    @TableId(value = "id",type = IdType.AUTO)
    private int id;

    @TableField(value = "goods_id")
    private int goodsId;

    //正品' comment 'sku名称'
    @TableField(value = "sku_name")
    private String skuName;

    //sku 价格
    @TableField(value = "sku_price")
    private BigDecimal skuPrice;

    //创建时间
    @TableField(value = "create_time")
    private Date createTime;

    //更新时间
    @TableField(value = "update_time")
    private Date updateTime;
}
