package com.cg.banking.client;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.banking.beans.Account;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;


public class MainClass {
	public static void main(String[] args) throws InvalidAmountException, InvalidAccountTypeException, BankingServicesDownException, AccountNotFoundException, AccountBlockedException, InsufficientAmountException, InvalidPinNumberException {
		boolean flag = true;
		//EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		ApplicationContext context=new ClassPathXmlApplicationContext("bankingBeans.xml");
		
		BankingServices bankingServices =(BankingServices) context.getBean("bankingServices");
		System.out.println("Kindly chose your option ");
		while(flag)
		{	
			System.out.println("Please chose an option: ");
			
			System.out.println("1. Create a new account ");
			System.out.println("2. Deposit money in an account");
			System.out.println("3. Withdram money from an account");
			System.out.println("4. Fund Transfer");
			System.out.println("5. Get Account Details");
			System.out.println("6. Show all accounts");
			System.out.println("7. Get Transactions");
			System.out.println("8. Exit");
			Scanner sc = new Scanner(System.in);
			int switchKey = sc.nextInt();
			switch(switchKey)
			{
			case 1 : System.out.println("**CREATING NEW ACCOUNT**");
					 System.out.println("Please chose an account type \n 1.Saving Account \t 2.Current Account ");
					 int accType= sc.nextInt();
					 float initBalance;
					 String accountType;
					 if(accType == 1 )
						  accountType = "Savings Account";
					 else if(accType == 2)
						  accountType = "Current Account" ; 
					 else 
						 throw new InvalidAccountTypeException("This is an invalid choice.");
					 
					 System.out.println("Enter initial balance");
					 initBalance = sc.nextFloat();
					 long accountNo = bankingServices.openAccount(accountType, initBalance);
					 Account newAcc = bankingServices.getAccountDetails(accountNo);
					 System.out.println("Account created : KINDLY NOTE YOUR CREDENTIALS");
					 System.out.println("Account Number : " + newAcc.getAccountNo() );
					 System.out.println("Pin Number : " + newAcc.getPinNumber());
					 System.out.println("Account Status : " + newAcc.getAccountStatus());
					 System.out.println("Balance : " + newAcc.getAccountBalance());
					 System.out.println("Account type : " + newAcc.getAccountType() + "\n");
					 break;
					 
			case 2 : System.out.println("****DEPOSIT MONEY IN ACCOUNT****");
					 System.out.println("Enter your account number");
					 long accNo = sc.nextLong();
					 System.out.println("Enter the amount you want to deposit");
					 float depAmount = sc.nextFloat();
					 float newAmount = bankingServices.depositAmount(accNo, depAmount);
					 System.out.println("Transaction successful \nUpdated Balance  :" + newAmount);
					 break;
					 
			case 3 : System.out.println("****WITHDRAW MONEY FROM ACCOUNT****");
					 System.out.println("Enter your account number");
					 accNo = sc.nextLong();
					 System.out.println("Enter the amount you want to Withdraw");
					 float withAmount = sc.nextFloat();
					 System.out.println("Enter your pin number");
					 int pinNo = sc.nextInt();
					 newAmount = bankingServices.withdrawAmount(accNo, withAmount, pinNo);
					 System.out.println("Transaction successful \nUpdated Balance" + newAmount);
					 break;
					 
			case 4 : System.out.println("*****FUND TRANSFER*****");
					 System.out.println("Enter your account number");
					 long accountNoFrom = sc.nextLong();
					 System.out.println("Enter amount you want to transfer");
					 float transferAmount = sc.nextFloat();
					 System.out.println("Enter account number to transfer");
					 long accountNoTo = sc.nextLong();
					 System.out.println("Enter your pin number");
					 int pinNumber = sc.nextInt();
					 boolean success = bankingServices.fundTransfer(accountNoTo, accountNoFrom, transferAmount, pinNumber);
					 if(success)
						 System.out.println("Your transfer was successful ");
					 else
						 System.out.println("NOT SUCCESSFUL");
					 break;
			
			case 5 : System.out.println("*****ACCOUNT DETAILS********");
					 System.out.println("Enter your account number");
					 accNo = sc.nextLong();
					 System.out.println("Enter your pin number");
					 pinNo = sc.nextInt();
					 if(bankingServices.getAccountDetails(accNo).getPinNumber()==pinNo)
						 System.out.println(bankingServices.accountString(accNo));
					 else
						 System.out.println("WRONG PIN");
					 break;
					 
			case 6 : System.out.println("******ALL ACCOUNTS*******");
					 
					 System.out.println(bankingServices.getAllAccoutDetails());
					 break;
					 
			case 7 : System.out.println("******PRINT TRANSACTIONS FOR UR ACCOUNT******");
					 System.out.println("Enter your account number");
					 accNo = sc.nextLong();
					 System.out.println("Enter your pin");
					 pinNo = sc.nextInt();
					 if(bankingServices.getAccountDetails(accNo).getPinNumber()==pinNo)
						 System.out.println(((bankingServices.getAccountAllTransaction(accNo)))) ;
					 else
						 System.out.println("WRONG PIN NUMBER");
					 break;
					 
			case 8 : flag = false;
					 break;
					 
			default: System.out.println("Invalid option");
					 break;
			}
		}
	}
}
