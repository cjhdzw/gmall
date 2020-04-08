package com.study.gmall.user.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.study.gmall.bean.UmsMember;
import com.study.gmall.service.UmsMemberService;
import com.study.gmall.user.mapper.UmsMemberMapper;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getUmsList() {
        return umsMemberMapper.getUmsList();
    }
}
