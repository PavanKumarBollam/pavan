package com.cg.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.cg.model.CustomerDetails;

class BankSpringDaoImplTest {
	
	
	BankDao bank=new BankDaoImpl();
	CustomerDetails customer=new CustomerDetails();
	CustomerDetails customer1=new CustomerDetails();

	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRegister() {
		String expected="kumar";
		customer.setFirstName("kumar");
		customer.setLastName("bollam");
		customer.setEmailId("kumar@01gmail.com");
		customer.setPassword("kumar@425");
		customer.setPancardNo(121212);
		customer.setAadharNo("121212121212");
		customer.setAddress("Delhi");
		customer.setMobileNo("8179181791");
		customer.setBalance(0);
		assertEquals(expected, bank.register(customer).getFirstName());
		
	}

	@Test
	void testLogin() {
		int expected=1;
		customer1.setAccountNo(1);
		customer1.setPassword("kala");
		assertEquals(expected, bank.login(customer1));
	}

}
