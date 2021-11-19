package com.project.etsapi.service;

import com.project.etsapi.entity.Account;

/**
 * @Created by Intellij IDEA
 * @Description
 * @Author Li Lijun
 * @Date 2021/11/19
 * @Time 19:41
 **/


public interface AccountService {
    Account getAccountById(String account_ID);

    Boolean idMatchPassword(String account_ID, String password);
}
