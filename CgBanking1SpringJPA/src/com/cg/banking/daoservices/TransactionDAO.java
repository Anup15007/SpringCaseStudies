package com.cg.banking.daoservices;

import java.util.List;

import com.cg.banking.beans.Transaction;

public interface TransactionDAO {
	Transaction save(Transaction transaction);
	Transaction findOne(int transactionId);
	List<Transaction> findAll(long accNo);
}
