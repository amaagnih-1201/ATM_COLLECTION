package com.atm.service;

import com.atm.dao.AtmDao;
import com.atm.dao.AtmDaoImpl;
import com.atm.model.Bank;

public class AtmServiceImpl implements AtmService {

	private AtmDao ad=new AtmDaoImpl();
	@Override
	public void addBank(Bank b) {
		
		ad.addBank(b);
	}
	@Override
	public Bank getBankInfo(String cnumber) {
		
		return ad.getBankInfo(cnumber);
	}

	@Override
	public void withdraw(double amount, Bank binfo) {
		// TODO Auto-generated method stub
		ad.withdraw(amount, binfo);
	}



}
