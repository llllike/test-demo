package com.cache.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cache.pojo.TbUser;



public interface TbUserService extends IService<TbUser> {
    TbUser findUserById(int id);

}
