package org.kitsoft.designpatterns.mvc.onlinebanking.model;

import java.util.ArrayList;
import java.io.Serializable;

public class CustomerInfo implements Serializable
{
	private String name; //고객이름
	private String id;	 //아이디
	private String pw;	 //비밀번호
	
	public CustomerInfo(String name, String id, String pw)
	{
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	public String getID() {
		return id;
	}
	public String getPassword() {
		return pw;
	}
	public String getName() {
		return name;
	}
	
	public boolean confirmID(String id) {
		if(this.id.equals(id))
			return true;
		else
			return false;
	}
	public boolean confirmPW(String pw) {
		if(this.pw.equals(pw))
			return true;
		else
			return false;
	}
}