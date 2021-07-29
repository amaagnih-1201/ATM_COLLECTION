package com.atm.controllet;

import java.util.Scanner;

import com.atm.model.Bank;
import com.atm.service.AtmService;
import com.atm.service.AtmServiceImpl;

public class AtmMain {

	static Scanner sc = null;
	static AtmService as = new AtmServiceImpl();

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int choice;
		while (true) {

			System.out.println("Please select the option you want to perform");
			System.out.println("1.Enter bank details");
			System.out.println("2.Enter card details to withdraw money");
			System.out.println("5.Exit");
			System.out.println("Enter Ur Choice");
			choice = sc.nextInt();
			performOperation(choice);
		}

	}

	private static void performOperation(int choice) {
		switch (choice) {

		case 1:
			System.out.println("Please enter bank name of customer");
			String bname = sc.next();
			System.out.println("Please enter your name");
			String cname = sc.next();
			System.out.println("Please enter card number");
			String cnum = sc.next();
			System.out.println("Please enter your balance");
			long bal = sc.nextLong();
			Bank b = new Bank(bname, cname, cnum, bal);
			as.addBank(b);
			break;

		case 2:
			// Bank bankDetails=new Bank();

			// inserting atm card
			System.out.println("Welcome to CITI Bank ATM");
			System.out.println("----------------x------------x----------x--------");
			System.out.println("Please enter card details to withdraw money");
			System.out.println("----------------x------------x----------x--------");
			System.out.println("Please enter card number");
			String cnumber = sc.next();
			Bank binfo = as.getBankInfo(cnumber);
			System.out.println("Please enter amount to withdraw");
			double amount = sc.nextLong();
			if (binfo != null && binfo.getBalance() >= amount && binfo.getBalance() > 0) {
				as.withdraw(amount, binfo);
				System.out.println("balance updated");
			} else {
				System.out.println("Transaction invalid !! sufficient amount is not available");
			}
			break;
		}

	}

}
