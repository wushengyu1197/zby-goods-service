package com.shopping.service.GoodInfo;

import com.shopping.model.GoodInfo;
import com.shopping.vo.GoodBody;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodInfoService {

    GoodInfo findById(Long id);

    GoodInfo findByOne(GoodInfo goodInfo);

    int insertOne(GoodInfo goodInfo);

    int updateOne(GoodInfo goodInfo);

    int DeleteOne(GoodInfo goodInfo);

    List<GoodBody> findGoodById(Long id);

    List<GoodInfo> findAll();

}
