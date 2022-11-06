package com.example.clothesshopjava.controller;

import com.example.clothesshopjava.configs.JwtTokenUtil;
import com.example.clothesshopjava.dtos.UserInfo;
import com.example.clothesshopjava.entities.Account;
import com.example.clothesshopjava.entities.Brand;
import com.example.clothesshopjava.services.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public Boolean delete(@PathVariable int id) {
        try {
            Boolean rs = false;
            if (accountService.deleteOne(id)) {
                rs = true;
            }
            return rs;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public Account save(@RequestBody Account account) {
        try {
            account.setUpdate_at(new Date());
            account = accountService.save(account);
            return account;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public UserInfo login(@RequestBody Account account) {
        try {
            Account _account = accountService.login(account.getUser_name(), account.getPassword());
            if (_account != null) {
                var tokenConfig = new JwtTokenUtil();
                var info = new UserInfo();
                info.setAccount_id(account.getAccount_id());
                info.setUser_name(account.getUser_name());
                info.setAvatar(account.getAvatar());
                info.setActive(account.isActive());
                info.setAdmin(account.isAdmin());
                info.setAddress(account.getAddress());
                info.setEmail(account.getEmail());
                info.setPhone(account.getPhone());
                var token = tokenConfig.generateToken(info);
                info.setToken(token);
                return info;
            }
            else {
                return null;
            }
        }
        catch (Exception ex) {
            return null;
        }
    }
}
