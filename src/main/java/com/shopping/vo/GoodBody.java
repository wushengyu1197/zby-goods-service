package com.shopping.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * zby个人原创
 *
 * @author zby
 * @date 2022/06/28 14:36
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodBody {
    private String skuName;

    private BigDecimal skuPrice;

    private String goodsName;
}