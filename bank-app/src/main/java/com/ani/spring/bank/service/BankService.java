package com.ani.spring.bank.service;

import com.ani.spring.bank.exception.AccountNotFoundException;
import com.ani.spring.bank.exception.InvalidAmountException;

public interface BankService {

    String deposit(String acNum, Double amt) throws AccountNotFoundException, InvalidAmountException;
    String withdraw(String acNum, Double amt)throws AccountNotFoundException, InvalidAmountException;
    Double balance(String acNum) throws AccountNotFoundException;
    String transfer(String srcAc, String destAc, Double amt) throws AccountNotFoundException, InvalidAmountException;

    //List of Bank Transactions is pending
}
