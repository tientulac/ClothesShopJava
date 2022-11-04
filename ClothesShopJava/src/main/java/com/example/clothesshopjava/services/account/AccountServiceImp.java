package com.example.clothesshopjava.services.account;

import com.example.clothesshopjava.entities.Account;
import com.example.clothesshopjava.entities.Brand;
import com.example.clothesshopjava.repositories.AccountRepository;
import com.example.clothesshopjava.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp implements AccountService{
    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account findById(int id) {
        return accountRepository.findById(id).get();
    }
}
