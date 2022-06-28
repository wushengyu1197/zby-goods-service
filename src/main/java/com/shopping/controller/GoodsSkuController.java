package com.shopping.controller;

import com.shopping.model.GoodsSku;
import com.shopping.service.GoodsSku.GoodsSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * zby个人原创
 *
 * @author zby
 * @date 2022/06/28 16:01
 **/
@RestController
@RequestMapping("/goodsSku")
public class GoodsSkuController {

    @Autowired
    private GoodsSkuService goodsSkuService;

    @RequestMapping("/addNewGoodsSkuz")
    public Boolean addNewGoodsSku(@RequestBody GoodsSku goodsSku){
        return goodsSkuService.insertOne(goodsSku)>0;
    }

    @GetMapping("/findAllGoodsSku")
    public List<GoodsSku> findAllGoodsSku(){
        return goodsSkuService.findAllGoodsSku();
    }

}