package com.shopping.controller;

import com.shopping.model.GoodInfo;
import com.shopping.service.GoodInfo.GoodInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class GoodsController {

    @Autowired
    private GoodInfoService goodInfoService;

    @PostMapping("/insert")
    public int insert(@RequestBody GoodInfo goodInfo){
        return goodInfoService.insertOne(goodInfo);
    }
}


