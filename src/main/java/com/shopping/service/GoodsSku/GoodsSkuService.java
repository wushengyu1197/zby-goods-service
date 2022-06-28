package com.shopping.service.GoodsSku;

import com.shopping.model.GoodsCategory;
import com.shopping.model.GoodsSku;

import java.util.List;

public interface GoodsSkuService {

    GoodsSku findById(int id);

    GoodsSku findByOne(GoodsSku goodsSku);

    int insertOne(GoodsSku goodsSku);

    int updateOne(GoodsSku goodsSku);

    int DeleteOne(int id);

    List<GoodsSku> findAllGoodsSku();
}
