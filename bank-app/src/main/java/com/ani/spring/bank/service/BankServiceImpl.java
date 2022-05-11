package com.ani.spring.bank.service;

import com.ani.spring.bank.domain.Bank;
import com.ani.spring.bank.exception.AccountNotFoundException;
import com.ani.spring.bank.exception.InvalidAmountException;
import com.ani.spring.bank.repository.BankRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BankServiceImpl implements BankService {

    private BankRepository repository;

    @Override
    public String deposit(String acNum, Double amt) throws AccountNotFoundException, InvalidAmountException {

        Bank bank = repository.findOne(acNum);

//        repository.update();
        return null;
    }

    @Override
    public String withdraw(String acNum, Double amt) throws AccountNotFoundException, InvalidAmountException {
        return null;
    }

    @Override
    public Double balance(String acNum) throws AccountNotFoundException {
        return null;
    }

    @Override
    public String transfer(String srcAc, String destAc, Double amt) throws AccountNotFoundException, InvalidAmountException {
        return null;
    }
}
