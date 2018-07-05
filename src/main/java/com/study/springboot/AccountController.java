package com.study.springboot;

import com.bean.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 *
 * @author jiajunkang
 * @version 1.0.0
 **/
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAccountById")
    public Account findAccountById(int id){
        return accountService.findAccountById(id);
    }

}
