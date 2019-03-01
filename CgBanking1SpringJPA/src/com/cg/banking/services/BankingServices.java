package com.cg.banking.services;

import java.util.List;

import com.cg.banking.beans.*;
import com.cg.banking.exceptions.*;


public interface BankingServices {

	long openAccount(String accountType , float initBalance)
	throws InvalidAmountException , InvalidAccountTypeException , BankingServicesDownException;

	float  depositAmount(long accountNo , float amount) throws AccountNotFoundException,  BankingServicesDownException , AccountBlockedException ; 

	float withdrawAmount(long accountNo, float amount , int pinNumber)
			throws InsufficientAmountException , AccountNotFoundException , InvalidPinNumberException , BankingServicesDownException , AccountBlockedException ; 

	boolean fundTransfer( long accountNoTo , long accountNoFrom , float transferAmount , int pinNumber) throws InsufficientAmountException , AccountNotFoundException ,
	InvalidPinNumberException , BankingServicesDownException , AccountBlockedException;

	Account getAccountDetails(long accountNo) throws AccountNotFoundException  , BankingServicesDownException;

	List<Account> getAllAccoutDetails() throws BankingServicesDownException;

	List<Transaction> getAccountAllTransaction(long accountNo) throws BankingServicesDownException , AccountNotFoundException ; 

	public String accountString(long accountNo) throws BankingServicesDownException , AccountNotFoundException , AccountBlockedException ; 
}