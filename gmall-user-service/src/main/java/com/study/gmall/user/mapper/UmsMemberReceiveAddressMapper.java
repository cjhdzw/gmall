package com.study.gmall.user.mapper;


import com.study.gmall.bean.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UmsMemberReceiveAddressMapper {

    @Select("select * from ums_member_receive_address")
    List<UmsMemberReceiveAddress> getUmsAddrs();
}
