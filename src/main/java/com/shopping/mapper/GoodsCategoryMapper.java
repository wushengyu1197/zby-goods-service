package com.shopping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shopping.model.GoodsCategory;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsCategoryMapper extends BaseMapper<GoodsCategory> {

    @Select("select * from goods_category")
    List<GoodsCategory> selectAll();
}
