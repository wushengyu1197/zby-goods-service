package com.shopping.service.GoodsCategory;

import com.shopping.model.GoodsCategory;

import java.util.List;

public interface GoodsCategoryService {

    GoodsCategory findById(int id);

    GoodsCategory findByOne(GoodsCategory goodsCategory);

    int insertOne(GoodsCategory goodsCategory);

    int updateOne(GoodsCategory goodsCategory);

    int DeleteOne(int id);

    List<GoodsCategory> findAllGoodsCategory();
}
