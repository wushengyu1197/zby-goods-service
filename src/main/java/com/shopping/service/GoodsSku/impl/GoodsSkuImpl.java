package com.shopping.service.GoodsSku.impl;

import com.shopping.mapper.GoodsSkuMapper;
import com.shopping.model.GoodsSku;
import com.shopping.service.GoodsSku.GoodsSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
//        System.out.println(dateFormat.format(date));
        goodsSku.setCreateTime(new Date());
        goodsSku.setUpdateTime(new Date());
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

    @Override
    public List<GoodsSku> findAllGoodsSku() {
        return goodsSkuMapper.findAllGoodsSku();
    }
}
