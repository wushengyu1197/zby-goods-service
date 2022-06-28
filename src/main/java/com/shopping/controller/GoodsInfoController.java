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
//        QueryWrapper<GoodInfo> queryWrapper = new QueryWrapper<>();
//        queryWrapper.like(StringUtils.hasText(nickName), "t_user.nick_name", nickName);
//        queryWrapper.like(StringUtils.hasText(title), "t_blog.title", title);
//        queryWrapper.eq("t_blog.deleted_flag", 0);
//        queryWrapper.eq("t_user.deleted_flag", 0);
//        queryWrapper.apply("t_blog.user_id = t_user.id");
        return goodInfoService.findGoodById(id);
    }
}


