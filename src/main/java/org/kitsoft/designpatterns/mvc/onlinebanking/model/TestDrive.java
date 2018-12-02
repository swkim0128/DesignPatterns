package org.kitsoft.designpatterns.mvc.onlinebanking.model;

import java.io.*;
import java.util.ArrayList;

public class TestDrive 
{
	public static void main(String[] args)
	{
		DataAccessManager io = DataAccessManager.getInstance();
		
		CustomerInfo customer = new CustomerInfo("김규호", "1", "1234");
		io.createCustomerInfo(customer);
	}
}
