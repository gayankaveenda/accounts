package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.model.Accounts;
import com.eazybytes.accounts.model.Customer;
import com.eazybytes.accounts.repository.AccountsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    @PostMapping("/myAccount")
    Accounts getAccountDetails(@RequestBody Customer customer) {
        log.info("User Input" + customer);
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
        log.info("System Returned" + accounts);
        return accounts != null ? accounts : null;
    }

}
