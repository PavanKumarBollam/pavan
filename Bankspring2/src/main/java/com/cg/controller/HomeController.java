package com.cg.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cg.model.CustomerDetails;
import com.cg.model.TransactionDetails;
import com.cg.service.BankService;
import com.cg.service.TransactionService;

@RestController
public class HomeController {
	
	int accountNumber;
	CustomerDetails customer = new CustomerDetails();
	public ArrayList<CustomerDetails> custList;
	ArrayList<TransactionDetails> transList;
	
	int transactionId = 101;
	@Autowired
	BankService bank;
	@Autowired
	TransactionService tService;
	
	
	@GetMapping(value="/")
	public void start() {
		CustomerDetails customer = bank.setInfo();
		custList = new ArrayList<CustomerDetails>();
		custList.add(customer);		
		transList = new ArrayList<TransactionDetails>();		
	}
	
	
	@RequestMapping(value="/getAllDetails",method=RequestMethod.GET)
	public ArrayList<CustomerDetails> getAllEmp(){
		
		return custList;
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ResponseEntity register(@RequestBody CustomerDetails customer) {
		custList.add(customer);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public void login(@RequestBody CustomerDetails c) {
		accountNumber = bank.login(custList,c);
	}
	
	
	@RequestMapping(value="/deposit",method=RequestMethod.PUT)
	public int deposit(@RequestBody int amt) {
		int amount = 0;
		if(accountNumber != 0) {
			amount = tService.deposit(accountNumber,custList,amt);
		}
		return amount;
		
	}
	
	@RequestMapping(value="/withdraw",method=RequestMethod.PUT)
	public int withdraw(@RequestBody int amt) {
		int amount = 0;
		System.out.println(amt);
		if(accountNumber != 0) {
			amount = tService.withdraw(accountNumber,custList,amt);
		}
		return amount;
	}
	
	@RequestMapping(value="/showbalance",method=RequestMethod.GET)
	public int showBalance() {
		int amount = 0;
		if(accountNumber != 0) {
			amount = tService.showBalance(accountNumber,custList);
		}
		return amount;
		
	}
	
	@RequestMapping(value="/fundtransfer",method=RequestMethod.PUT)
	public int fundTransfer(@RequestBody TransactionDetails transaction) {
		if(accountNumber != 0) {
			transaction = tService.fundTransfer(accountNumber,transaction,custList);
			transList.add(transaction);
		}
		return transaction.getAmt();
	}
	
	@RequestMapping(value="/getAllTransaction",method=RequestMethod.GET)
	public ArrayList<TransactionDetails> getAllTran(){
		
		return transList;
	}
}
