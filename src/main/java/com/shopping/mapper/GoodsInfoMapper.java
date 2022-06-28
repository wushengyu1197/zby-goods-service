package com.shopping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shopping.model.GoodInfo;
import com.shopping.vo.GoodBody;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface GoodsInfoMapper extends BaseMapper<GoodInfo> {

    /**
     * 静态查询
     */
    @Select("select a.sku_name,a.sku_price,b.goods_name"+
            " from goods_sku a,good_info b"+" where a.goods_id=b.id"+" and b.id=#{id}")
    List<GoodBody> findGoodById(@Param("id") Long id);

    @Select("select * from good_info")
    List<GoodInfo> findAllGood();
    /**
     * 动态查询
     */
//    @Select("SELECT * " +
//            " FROM t_blog, t_user " +
//            " ${ew.customSqlSegment} ")
//     IPage<BlogVO> findBlog(IPage<BlogVO> page, @Param("ew") Wrapper wrapper);

}
