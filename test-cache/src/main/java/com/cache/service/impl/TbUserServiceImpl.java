package com.cache.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cache.mapper.TbUserMapper;
import com.cache.pojo.TbUser;
import com.cache.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser>
    implements TbUserService{
    @Autowired
    TbUserMapper userMapper;
    @Override
    public TbUser findUserById(int id) {
        TbUser tbUser = userMapper.selectById(id);
        return tbUser;
    }
}




