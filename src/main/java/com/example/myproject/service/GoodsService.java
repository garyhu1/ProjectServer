package com.example.myproject.service;

import com.example.myproject.pojo.Goods;

import java.math.BigDecimal;
import java.util.List;

public interface GoodsService {

    int addGoods(Goods goods);

    int modifyGoods(Goods goods);

    int deleteGoods(int id);

    List<Goods> findGoods(Goods goods, int limit, int offset);

    Goods findGoodDetails(long goodsId);

    BigDecimal findPrice(Long goodsId);
}
