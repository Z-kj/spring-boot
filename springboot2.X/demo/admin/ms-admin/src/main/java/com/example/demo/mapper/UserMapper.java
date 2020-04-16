package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author dadada
 * @since 2019-10-09
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
