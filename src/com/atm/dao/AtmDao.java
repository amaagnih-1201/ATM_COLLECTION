package com.atm.dao;

import com.atm.model.Bank;

public interface AtmDao {

	void addBank(Bank b);

	Bank getBankInfo(String cnumber);

	void withdraw(double amount, Bank binfo);

}
