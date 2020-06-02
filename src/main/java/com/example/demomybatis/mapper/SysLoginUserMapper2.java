package com.example.demomybatis.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demomybatis.entity.SysLoginUser;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 登录用户表 Mapper 接口
 * </p>
 *
 * @author wenchao
 * @since 2020-05-04
 */
@DS("test")
public interface SysLoginUserMapper2 extends BaseMapper<SysLoginUser> {

   int updatewechatid(@Param("uid") String uid);

}
