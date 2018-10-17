package org.kitsoft.designpatterns.abstractfactory.gui;

public class OSXFactory implements GUIFactory {
	public Button createButton() {
		return new OSXButton();
	}
}
