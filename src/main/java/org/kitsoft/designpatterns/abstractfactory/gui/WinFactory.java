package org.kitsoft.designpatterns.abstractfactory.gui;

public class WinFactory implements GUIFactory {
	public Button createButton() {
		return new WinButton();
	}
}
