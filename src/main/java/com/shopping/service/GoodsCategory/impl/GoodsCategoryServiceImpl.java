package com.shopping.service.GoodsCategory.impl;

import com.shopping.mapper.GoodsCategoryMapper;
import com.shopping.model.GoodsCategory;
import com.shopping.service.GoodsCategory.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;

    @Override
    public GoodsCategory findById(int id) {
        return goodsCategoryMapper.selectById(id);
    }

    @Override
    public GoodsCategory findByOne(GoodsCategory goodsCategory) {
        return null;
    }

    @Override
    public int insertOne(GoodsCategory goodsCategory) {
        return goodsCategoryMapper.insert(goodsCategory);
    }

    @Override
    public int updateOne(GoodsCategory goodsCategory) {
        return goodsCategoryMapper.updateById(goodsCategory);
    }

    @Override
    public int DeleteOne(int id) {
        return goodsCategoryMapper.deleteById(id);
    }

    @Override
    public List<GoodsCategory> findAllGoodsCategory() {
        return goodsCategoryMapper.selectAll();
    }
}
