package com.swe.accountservice.service;

import com.swe.accountservice.entity.Account;
import com.swe.accountservice.repo.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;


    public Account get(String id){
       return accountRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public Account save(Account account){
        return accountRepository.save(account);
    }

    public Account update(String id,Account account){
        Assert.isNull(id, "Id can not be null");
        return accountRepository.save(account);
    }

    public void delete(String id){

    }

    public List<Account> findAll() {
       return accountRepository.findAll();
    }
}
