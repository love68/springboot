package com.Mapper;

import com.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * AccountMapper
 *
 * @author jiajunkang
 * @version 1.0.0
 **/
@Mapper
public interface AccountMapper {
    @Select("select id, name as name, money as money from account where id = #{id}")
    Account findAccount(@Param("id") int id);
}
