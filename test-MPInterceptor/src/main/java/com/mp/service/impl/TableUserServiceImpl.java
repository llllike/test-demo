package com.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mp.pojo.TableUser;
import com.mp.service.TableUserService;
import com.mp.mapper.TableUserMapper;
import org.springframework.stereotype.Service;



@Service
public class TableUserServiceImpl extends ServiceImpl<TableUserMapper, TableUser>
    implements TableUserService{

}




