package com.shopping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shopping.model.GoodsSku;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsSkuMapper extends BaseMapper<GoodsSku> {

    @Select("select * from goods_sku")
    List<GoodsSku> findAllGoodsSku();
}
