package com.shopping.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("goods_category")
public class GoodsCategory {

    //类目id
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    //类目名称
    @TableField(value = "name")
    private String name;

    //父类目 0=一级类目
    @TableField(value = "parent_id")
    private String parentId;

    //创建时间
    @TableField(value = "create_time")
    private Date createTime;

    //'更新时间
    @TableField(value = "update_time")
    private Date updateTime;

    //是否已删除
    @TableField(value = "is_del")
    private int isDel;
}
