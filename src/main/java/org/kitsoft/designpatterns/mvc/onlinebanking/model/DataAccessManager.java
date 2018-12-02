package org.kitsoft.designpatterns.mvc.onlinebanking.model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class DataAccessManager implements Serializable {
	private final String CUSTOMER_FILEPATH = "CustomerInfo.txt";
	private final String ACCOUNT_FILEPATH = "AccountInfo.txt";
	private String FILEPATH = null;
	
	private ArrayList<CustomerInfo> customerList = null;
	private ArrayList<Account> accountList = null;

	private static DataAccessManager Instance = null;
	static {
		try {
			Instance = new DataAccessManager();
		}
		catch(RuntimeException e) {
			throw new RuntimeException(e);
		}
	}

	private DataAccessManager() {
		initialize();
	}
	
	private void initialize() {		
		customerList = (ArrayList<CustomerInfo>)readObject(CUSTOMER_FILEPATH);
		accountList = (ArrayList<Account>)readObject(ACCOUNT_FILEPATH);
	}
	
	public static DataAccessManager getInstance() {
		return Instance;
	}
	
	public boolean createCustomerInfo(CustomerInfo c) {
		if(customerList == null) {
			customerList = new ArrayList<CustomerInfo>();
		}
		
		for(CustomerInfo info : customerList) {
			if(info.confirmID(c.getID())) {
				return false;					
			}
		}
		
		customerList.add(c);
		FILEPATH = CUSTOMER_FILEPATH;
		writeObject(customerList);
		
		return true;
	}
	
	public CustomerInfo findCustomer(String id, String pw) {
		initialize();
		for(CustomerInfo c : customerList) {
			if(c.confirmID(id)) {
				if(c.confirmPW(pw))
					return c;					
			}
		}
		
		return null;
	}

	public boolean createAccount(Account account) {		
		if(accountList == null) {
			accountList = new ArrayList<Account>();
		}
		
		for(Account info : accountList) {
			if(info.isAccount(account.getAccountNum())) {
				return false;
			}
		}

		accountList.add(account);
		FILEPATH = ACCOUNT_FILEPATH;
		writeObject(accountList);
		
		return true;
	}
	
	public void saveAccount(Account account) {
		Account temp = null;
		for(int i = 0; i < accountList.size(); i++) {
			temp = accountList.get(i);
			
			if(temp.isAccount(account.getAccountNum())) {
				accountList.set(i, account);
			}
		}
		
		FILEPATH = ACCOUNT_FILEPATH;
		writeObject(accountList);
	}
	
	public Account findAccount(String accountNum) {	
		initialize();
		
		for(Account a : accountList) {
			if(a.isAccount(accountNum))
				return a;
		}
		return null;
	}
	
	public ArrayList<Account> findAccountList(String id) {
		initialize();
		
		ArrayList<Account> temp = new ArrayList<Account>();
		
		if(accountList == null) {
			return temp;
		}
		
		for(Account a : accountList) {
			if(a.isCustomer(id)) {
				temp.add(a);
			}
		}
		
		return temp;
	}

	private Object readObject(String file) {
		Object o = null;
		
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis); 
			ObjectInputStream input = new ObjectInputStream(bis);	
			
			o = input.readObject();

			input.close();
			
			return o;
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private void writeObject(Object o) {		
		try {
			FileOutputStream fos = new FileOutputStream(FILEPATH);
			BufferedOutputStream bos = new BufferedOutputStream(fos); 
			ObjectOutputStream output = new ObjectOutputStream(bos);
			
			output.writeObject(o);

			output.close();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}