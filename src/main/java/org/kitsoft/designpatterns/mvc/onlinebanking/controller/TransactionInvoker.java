package org.kitsoft.designpatterns.mvc.onlinebanking.controller;

import java.io.Serializable;

public class TransactionInvoker implements Serializable {
	private TransactionControllerImp transactionController;
	
	public TransactionInvoker() {

	}
	
	public void setTransaction(TransactionControllerImp tci) {
		this.transactionController = tci;		
	}
	
	public void order(String... infos) {
		transactionController.execute(infos);
	}
}
