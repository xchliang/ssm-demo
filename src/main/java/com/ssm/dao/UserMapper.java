package com.ssm.dao;

import com.ssm.model.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User getUserById(Long id);

    User getUserByName(String name);
}
