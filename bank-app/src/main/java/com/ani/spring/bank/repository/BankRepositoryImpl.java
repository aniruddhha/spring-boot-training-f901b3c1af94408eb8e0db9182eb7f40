package com.ani.spring.bank.repository;

import com.ani.spring.bank.domain.Bank;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BankRepositoryImpl implements BankRepository {
    @Override
    public void create(Bank bank) {

    }

    @Override
    public Bank update(Bank bank) {
        return null;
    }

    @Override
    public List<Bank> findAll() {
        return null;
    }

    @Override
    public Bank findOne(String acNum) {
        return null;
    }
}
