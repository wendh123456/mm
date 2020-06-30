package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.stereotype.Repository;


@Repository("accountDao")
public class IAccountDaoImpl implements IAccountDao {
    public void saveAccount() {


            System.out.println("保存了账户1111111111111");
        }
    }

