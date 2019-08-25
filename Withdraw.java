package com.assignment;

import java.util.Scanner;

import com.assignment.exception.InsufficientBalanceException;

public class Withdraw {
	
	int balance=0, amount;
	static Scanner scan=new Scanner(System.in);

	public void withdrawAmount() throws InsufficientBalanceException {
		System.out.println("Enter Amount");
		amount=scan.nextInt();
		balance=balance-amount;
		if(balance<=0) {
			
			throw new InsufficientBalanceException("Insufficient Balance Exception");
			
		}
		else {
			System.out.println("Withdraw Successfully and balance is: " + balance);
		}
	}
	
	public void depositAmount() {
		System.out.println("Enter Amount");
		balance=scan.nextInt();
		balance=balance+amount;
		System.out.println("Deposited Successfully and balance is: " + balance);


	}
	
	public static void main(String[] args) throws InsufficientBalanceException {
		
		Withdraw withdraw=new Withdraw();
		while(true) {
		System.out.println("Enter 1 for deposit, 2 for withdraw, 3 for exit");

		int input=scan.nextInt();
		
		
		switch(input) {
		
		case 1	: withdraw.depositAmount();
					break;
					
		case 2 : withdraw.withdrawAmount();
					break;
			
		case 3 : System.exit(1);
	}
	}}
}
