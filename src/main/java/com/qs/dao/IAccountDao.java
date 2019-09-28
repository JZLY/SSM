package com.qs.dao;

import com.qs.domain.Account;

import java.util.List;

public interface IAccountDao {

    List<Account> queryAccountList();

    void updateAccount(Account account);
}
