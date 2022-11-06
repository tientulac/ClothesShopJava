package com.example.clothesshopjava.services.account;

import com.example.clothesshopjava.entities.Account;

public interface AccountService {
    Account findById(int id);
    Account login(String user_name, String password);
    Account save(Account account);
    boolean deleteOne(int id);
}
