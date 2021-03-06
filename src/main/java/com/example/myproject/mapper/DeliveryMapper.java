package com.example.myproject.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.myproject.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 收货地址数据处理层
 *
 * @author Mettre
 */
public interface DeliveryMapper extends BaseMapper<Address> {

//    int insert(Address address);

    int update(Address address);

    Address findDefaultDelivery(String userId);

    List<Address> findByPage(@Param(value = "userId") String userId, @Param(value = "limit") Integer limit, @Param(value = "offset") Integer offset);

    int deleteAddress(@Param(value = "userId") String userId, @Param(value = "id") String id);

    List<Address> selectPageVo(Page page, @Param(value = "userId") String userId);
}