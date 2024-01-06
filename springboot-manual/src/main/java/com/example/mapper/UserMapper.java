package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.pojo.User;

@Mapper
public interface UserMapper {

  @Select("SELECT * FROM user WHERE id = #{id}")
  public User findById(Integer id);
}