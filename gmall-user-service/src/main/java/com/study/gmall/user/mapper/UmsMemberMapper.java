package com.study.gmall.user.mapper;


import com.study.gmall.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UmsMemberMapper {

    @Select("select * from ums_member")
    public List<UmsMember> getUmsList();


}
