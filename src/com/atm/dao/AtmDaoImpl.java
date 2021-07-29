package com.atm.dao;

import com.atm.model.Bank;
import com.atm.util.DataStore;

public class AtmDaoImpl implements AtmDao{

	private DataStore ds= new DataStore();

	@Override
	public void addBank(Bank b) {
		ds.addBank(b);
		
	}

	@Override
	public Bank getBankInfo(String cnumber) {
		
		return ds.getBankInfo(cnumber);
	}


	@Override
	public void withdraw(double amount, Bank binfo) {
		// TODO Auto-generated method stub
		ds.withdraw(amount, binfo);
	}
}
