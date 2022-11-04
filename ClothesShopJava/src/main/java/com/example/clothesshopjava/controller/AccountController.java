package com.example.clothesshopjava.controller;

import com.example.clothesshopjava.entities.Account;
import com.example.clothesshopjava.entities.Category;
import com.example.clothesshopjava.services.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/account") // router
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Account findById(@PathVariable int id) {
        try {
            System.out.println(id);
            Account acc = accountService.findById(id);
            return acc;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
