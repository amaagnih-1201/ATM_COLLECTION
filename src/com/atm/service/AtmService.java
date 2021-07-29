package com.atm.service;

import com.atm.model.Bank;

public interface AtmService {

	void addBank(Bank b);

	Bank getBankInfo(String cnumber);

	void withdraw(double amount, Bank binfo);

}
