package com.shopping.service.GoodsSku.impl;

import com.shopping.mapper.GoodsSkuMapper;
import com.shopping.model.GoodsSku;
import com.shopping.service.GoodsSku.GoodsSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsSkuImpl implements GoodsSkuService {
    @Autowired
    private GoodsSkuMapper goodsSkuMapper;
    @Override
    public GoodsSku findById(int id) {
        return goodsSkuMapper.selectById(id);
    }

    @Override
    public GoodsSku findByOne(GoodsSku goodsSku) {
        return null;
    }

    @Override
    public int insertOne(GoodsSku goodsSku) {
        return goodsSkuMapper.insert(goodsSku);
    }

    @Override
    public int updateOne(GoodsSku goodsSku) {
        return goodsSkuMapper.updateById(goodsSku);
    }

    @Override
    public int DeleteOne(int id) {
        return goodsSkuMapper.deleteById(id);
    }
}
