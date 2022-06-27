package com.shopping.service.UserInfo;

import com.shopping.model.UserInfo;

public interface UserInfoService {
    UserInfo findById(int id);

    UserInfo findByOne(UserInfo userInfo);

    int insertOne(UserInfo userInfo);

    int updateOne(UserInfo userInfo);

    int DeleteOne(int id);
}
