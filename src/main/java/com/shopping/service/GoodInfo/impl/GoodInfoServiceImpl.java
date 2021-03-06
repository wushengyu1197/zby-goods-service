package com.shopping.service.GoodInfo.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shopping.mapper.GoodsInfoMapper;
import com.shopping.model.GoodInfo;
import com.shopping.service.GoodInfo.GoodInfoService;
import com.shopping.vo.GoodBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodInfoServiceImpl implements GoodInfoService {

    @Autowired
    private GoodsInfoMapper goodsInfoMapper;


    @Override
    public GoodInfo findById(Long id) {
        return goodsInfoMapper.selectById(id);
    }

    @Override
    public GoodInfo findByOne(GoodInfo goodInfo) {

        QueryWrapper<GoodInfo> good = new QueryWrapper<GoodInfo>().eq("gender", 1);
        good.eq("id",goodInfo.getId());
        good.eq("goods_name",goodInfo.getGoodsName());
        good.eq("unit",goodInfo.getUnit());
        good.eq("price",goodInfo.getPrice());
        good.eq("publish_status",goodInfo.getPublishStatus());
        good.eq("category_id",goodInfo.getCategoryId());
        good.eq("sub_category",goodInfo.getSubCategoryId());
        good.eq("tags",goodInfo.getTags());
        good.eq("sort",goodInfo.getSort());
        good.eq("create_time",goodInfo.getCreateTime());
        good.eq("update_time",goodInfo.getUpdateTime());
        return goodsInfoMapper.selectOne(good);
    }

    @Override
    public int insertOne(GoodInfo goodInfo) {
        return goodsInfoMapper.insert(goodInfo);
    }

    @Override
    public int  updateOne(GoodInfo goodInfo) {
        return goodsInfoMapper.updateById(goodInfo);
    }

    @Override
    public int DeleteOne(GoodInfo goodInfo) {
        QueryWrapper<GoodInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("goods_name",goodInfo.getGoodsName());
        return goodsInfoMapper.delete(wrapper);
    }

    @Override
    public List<GoodBody> findGoodById(Long id) {
        return goodsInfoMapper.findGoodById(id);
    }

    @Override
    public List<GoodInfo> findAll() {
        return goodsInfoMapper.findAllGood();
    }
}
