package com.service;

import com.Mapper.AccountMapper;
import com.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AccountService
 *
 * @author jiajunkang
 * @version 1.0.0
 **/
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public Account findAccount(int id){
        return accountMapper.findAccount(id);
    }

    public Account findAccountById(int id){
        return accountMapper.findAccountById(id);
    }
}
