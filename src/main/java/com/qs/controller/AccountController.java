package com.qs.controller;

import com.qs.domain.Account;
import com.qs.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/query")
    public String queryAccountList() {
        System.out.println("查询所有账户。。。");
        accountService.queryAccountList();
        return "list";
    }

    @RequestMapping("/update")
    public void updateAccount(Account account) {

    }

}
