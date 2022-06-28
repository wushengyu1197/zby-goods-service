package com.shopping.controller;

import com.shopping.model.GoodsCategory;
import com.shopping.model.UserInfo;
import com.shopping.service.GoodsCategory.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * zby个人原创
 *
 * @author zby
 * @date 2022/06/28 17:18
 **/
@RequestMapping("/goodsCategory")
@RestController
public class GoodsCategoryController {

    @Autowired
    private GoodsCategoryService goodsCategoryService;

    @PostMapping("/addGoodsCategory")
    public Boolean addGoodsCategory(@RequestBody GoodsCategory goodsCategory){
        return goodsCategoryService.insertOne(goodsCategory)>0;
    }

    @GetMapping("/findAllGoodsCategory")
    public List<GoodsCategory> findAllGoodsCategory(){
        return goodsCategoryService.findAllGoodsCategory();
    }

}