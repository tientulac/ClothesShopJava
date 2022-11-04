package com.example.clothesshopjava.repositories;

import com.example.clothesshopjava.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}