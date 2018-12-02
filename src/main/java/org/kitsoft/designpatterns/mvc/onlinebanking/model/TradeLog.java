package org.kitsoft.designpatterns.mvc.onlinebanking.model;

import java.util.Calendar;
import java.io.Serializable;

public class TradeLog implements Serializable
{
	private Calendar tradeDate;
	private int tradeAmount;
	private String tradeType;		//거래 유형(출금, 입금 ...)
	private int currentBalance;
	
	public TradeLog(int tradeAmount, String tradeType, int currentBalance)
	{
		tradeDate = Calendar.getInstance(); //현재 시간 정보를 가져옴
		this.tradeAmount = tradeAmount;
		this.tradeType = tradeType;
		this.currentBalance = currentBalance;
	}
	
	public void printLog()
	{
		System.out.println(tradeDate.get(tradeDate.YEAR)+"."+tradeDate.get(tradeDate.MONTH)+"."+tradeDate.get(tradeDate.DATE)+"."+" "+tradeAmount+"원 거래  "+"유형: "+tradeType+" 현재잔고:"+ currentBalance);
	}
}
