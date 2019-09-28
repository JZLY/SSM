package com.qs.service.impl;

import com.qs.dao.IAccountDao;
import com.qs.domain.Account;
import com.qs.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> queryAccountList() {
        System.out.println("查询方法。。。");
        List<Account> accounts = accountDao.queryAccountList();
        accounts.stream().forEach(System.out::println);
        return null;
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("更新方法。。。");
    }
}
