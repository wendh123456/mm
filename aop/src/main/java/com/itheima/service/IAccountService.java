package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface IAccountService {

    void updateAccount(Account account);

    void transfer(String sourceName,String targetName,float money);

}
