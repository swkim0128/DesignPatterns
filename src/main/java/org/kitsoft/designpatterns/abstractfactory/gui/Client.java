package org.kitsoft.designpatterns.abstractfactory.gui;

public class Client {
	
	public static void main(String[] args) {
		GUIFactory winFact = new WinFactory();
		GUIFactory osxFact = new OSXFactory();
		
		Button button = winFact.createButton();
		button.paint();
		
		button = osxFact.createButton();
		button.paint();
	}
}
