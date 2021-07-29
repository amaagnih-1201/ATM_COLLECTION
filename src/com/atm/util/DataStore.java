package com.atm.util;

import java.util.LinkedList;
import java.util.List;

import com.atm.model.Bank;

public class DataStore {

	List<Bank> blIst = new LinkedList<Bank>();

	public void addBank(Bank b) {
		blIst.add(b);

		System.out.println("Bank details are inserted" + b.toString());
	}

	public Bank getBankInfo(String cnumber) {
		for (int i = 0; i < blIst.size(); i++) {
			// custlIst.contains(productname);
			if (blIst.size() > 0 && blIst != null && blIst.get(i).getCardNumber().equals(cnumber)) {
				return blIst.get(i);

			} else {
				System.out.println("No Data found");
			}
		}
		return null;
	}

	public void withdraw(double amount, Bank binfo) {

		for (Bank list : blIst) {
			if (list.getCardNumber().equals(binfo.getCardNumber())) {
				list.setBalance(binfo.getBalance() - amount);
			}

		}

		for (Bank blBank : blIst) {
			if (blBank.getCardNumber().equals(binfo.getCardNumber())) {
				System.out.println("updated bank balance for user  " + blBank.getCardNumber() + "balance is "
						+ blBank.getBalance());
			}
		}

	}

}
