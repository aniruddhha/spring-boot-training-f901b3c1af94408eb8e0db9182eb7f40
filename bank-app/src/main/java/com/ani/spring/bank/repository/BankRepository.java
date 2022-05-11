package com.ani.spring.bank.repository;

import com.ani.spring.bank.domain.Bank;

import java.util.List;

public interface BankRepository {

    void create(Bank bank);

    Bank update(Bank bank);

    List<Bank> findAll();

    Bank findOne(String acNum);
}
