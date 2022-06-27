package com.shopping.service.GoodInfo;

import com.shopping.model.GoodInfo;

public interface GoodInfoService {

    GoodInfo findById(int id);

    GoodInfo findByOne(GoodInfo goodInfo);

    int insertOne(GoodInfo goodInfo);

    int updateOne(GoodInfo goodInfo);

    int DeleteOne(int id);

}
