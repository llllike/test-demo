package com.cache.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cache.config.MybatisPlusRedisCache;
import com.cache.pojo.TbUser;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



@Mapper
@CacheNamespace(implementation = MybatisPlusRedisCache.class,eviction = MybatisPlusRedisCache.class)
public interface TbUserMapper extends BaseMapper<TbUser>{
}




