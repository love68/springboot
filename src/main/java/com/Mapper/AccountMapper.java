package com.Mapper;

import com.bean.Account;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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

    Account findAccountById(int id);

    @Select("select * from account")
    Page<Account> selectAccounts();
}
