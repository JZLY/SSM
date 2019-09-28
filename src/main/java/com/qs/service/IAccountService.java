package com.qs.service;

import com.qs.domain.Account;

import java.util.List;

public interface IAccountService {

    List<Account> queryAccountList();

    void updateAccount(Account account);

}
