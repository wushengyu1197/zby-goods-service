package com.shopping.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shopping.model.GoodInfo;
import com.shopping.service.GoodInfo.GoodInfoService;
import com.shopping.vo.GoodBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/goods")
@RestController
public class GoodsInfoController {

    @Autowired
    private GoodInfoService goodInfoService;

    @PostMapping("/insertGoods")
    public Boolean insertGoods(@RequestBody GoodInfo goodInfo) {
        return goodInfoService.insertOne(goodInfo) > 0;
    }

    @GetMapping("/findAllGood")
    public List<GoodInfo> findAllGood(){
        return goodInfoService.findAll();
    }
    @GetMapping("/findOneGood")
    public GoodInfo findOneGood(Long id){
        return goodInfoService.findById(id);
    }

    @GetMapping("/deleteGood")
    public Boolean deleteGood(@RequestBody GoodInfo goodInfo){
        return goodInfoService.DeleteOne(goodInfo)>0;
    }

    @GetMapping("/queryGoodsById")
    public List<GoodBody> query(Long id) {
        return goodInfoService.findGoodById(id);
    }

    @GetMapping("/UpperLowerShelves")
    public Boolean UpperLowerShelves(@RequestParam Long id,@RequestParam int publishStatus){
        if(1==publishStatus){
            GoodInfo good = goodInfoService.findById(id);
            if(0==good.getPublishStatus()){
                good.setSubCategoryId(1);
               return goodInfoService.updateOne(good)>0;
            }
        }
        if(0==publishStatus){
            GoodInfo good = goodInfoService.findById(id);
            if(1==good.getPublishStatus()){
                good.setSubCategoryId(0);
                return goodInfoService.updateOne(good)>0;
            }
        }
        return false;
    }

}


