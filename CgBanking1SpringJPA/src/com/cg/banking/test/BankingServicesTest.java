package com.cg.banking.test;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.banking.beans.*;
import com.cg.banking.exceptions.*;
import com.cg.banking.services.*;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;

public class BankingServicesTest {
}
	/*public static BankingServices services;
	private static EntityManagerFactory entityManagerFactory;
	
	@BeforeClass
	public static void setUpTestEnv() {
		services = new BankingServicesImpl();
		entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	}
	@Before
	public void setUpTestData()
	{
		Account account1 = new Account(100002, 1233, "Savings", "Active", 2000);
		Account account2 = new Account(100003, 1234, "Savings", "Active", 12000);
		
		Transaction transactionAcc1 = new Transaction(1000,"Deposit",account1);
		Transaction transactionAcc2 = new Transaction(1000,"Deposit",account2);
		Map<Long,Transaction> transaction1 = new HashMap<Long, Transaction>();
		Map<Long,Transaction> transaction2 = new HashMap<Long, Transaction>();
		transaction1.put(100001L, transactionAcc1);
		transaction2.put(100001L, transactionAcc2);
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(transaction1);
		entityManager.persist(transaction2);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
		/*BankingDBUtil.accounts.put(account1.getAccountNo(), account1);
		BankingDBUtil.accounts.put(account2.getAccountNo(), account2);
		BankingDBUtil.ACCOUNT_NO_COUNTER=100003;*/
	/*
	@Test(expected = InvalidAccountTypeException.class)
	public void testOpenAccountForInvalidData() throws InvalidAccountTypeException, InvalidAmountException{
		long expectedAccountId = 100004;
		long actualAccountId=0;
		try {
			actualAccountId = services.openAccount("Savings", 1200);
		} catch (BankingServicesDownException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(expectedAccountId, actualAccountId);
	}
	@Test(expected = AccountNotFoundException.class)
	public void testDepositAmountForInvalidData() throws AccountNotFoundException{
		services.depositAmount(100000, 1200);
	}
	@Test(expected = InvalidAccountTypeException.class)
	public void testDepositAmountForValidData() throws InvalidAccountTypeException, InvalidAmountException{
		float expectedBalance = services.depositAmount(100002, 1200);
		float actualBalance = 2400;
		Assert.assertEquals(expectedBalance, actualBalance);
	}
	@Test(expected = AccountNotFoundException.class)
	public void testWithdrawAmountForValidData() throws InvalidAccountTypeException, InvalidAmountException{
		float expectedBalance = services.withdrawAmount(100002, 200,1233);
		float actualBalance = 1000;
		Assert.assertEquals(expectedBalance, actualBalance);
	}
	@Test(expected = AccountNotFoundException.class)
	public void testFundsTransferForValidData() throws AccountNotFoundException, InvalidAmountException, InvalidPinNumberException{
		services.fundTransfer(100002, 100003, 1000, 1234);
		float actualBalance = services.getAccountDetails(100002).getAccountBalance();
		float expectedBalance =3000;
		Assert.assertEquals(expectedBalance, actualBalance);
	}
	@Test(expected = AccountNotFoundException.class)
	public void testGetAccountDetailsForValidData() throws AccountNotFoundException, InvalidAmountException, InvalidPinNumberException{
		services.fundTransfer(100002, 100003, 1000, 1234);
		Account actualAccount = services.getAccountDetails(100002);
		Transaction transactionAcc1 = new Transaction(100002,1000,"Deposit");
		Map<Long,Transaction> transaction1 = new HashMap<Long, Transaction>();
		transaction1.put(100001L, transactionAcc1); 
		Account expectedAccount =new Account(100002, 1233, "Savings", "Active", 2000, transaction1);;
		Assert.assertEquals(expectedAccount, actualAccount);
	}
	@After
	public void tearDownTestData()
	{
		BankingDBUtil.accounts.clear();
		BankingDBUtil.ACCOUNT_NO_COUNTER=100000L;
	}
	@AfterClass
	public static void tearDownTestEnv() {
		services = null;
		entityManagerFactory=null;
	}*/
