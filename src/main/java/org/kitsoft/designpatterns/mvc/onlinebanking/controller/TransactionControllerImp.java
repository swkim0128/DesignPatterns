package org.kitsoft.designpatterns.mvc.onlinebanking.controller;

import java.io.Serializable;

public interface TransactionControllerImp extends Serializable {
	public void execute(String... accountInfos);
}
