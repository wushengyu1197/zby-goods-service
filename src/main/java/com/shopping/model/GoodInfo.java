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
@AllArgsConstructor
@NoArgsConstructor
@TableName("good_info")
public class GoodInfo {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    //商品名称
    @TableField(value = "goods_name")
    private String goodsName;

    //商品单位
    @TableField(value = "unit")
    private String unit;

    //商品价格
    @TableField(value = "price")
    private BigDecimal price;

    //上架状态 0=未上架 1=上架中 2=已上架 3=下架中 4=已下架'
    @TableField(value = "publish_status")
    private int publishStatus;

    //商品一级类目 服饰
    @TableField(value = "category_id")
    private int categoryId;


    //商品二级类目 连衣裙
    @TableField(value = "sub_category_id")
    private int subCategoryId;

    //商品标签 json
    @TableField(value = "tags")
    private String tags;

    //商品展示顺序
    @TableField(value = "sort")
    private int sort;

    //创建时间
    @TableField(value = "create_time")
    private Date createTime;

    //自动更新时间戳
    @TableField(value = "update_time")
    private Date updateTime;
}
