package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface IAccountDao {

    void updateAccount(Account account);

    Account findAccountByName(String accountName);

}
