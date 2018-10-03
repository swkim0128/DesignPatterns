package org.kitsoft.designpatterns.decorator.window;

public abstract class WindowDecorator implements Window {
	protected Window wrappedWindow;
	
	public WindowDecorator(Window w) {
		wrappedWindow = w;
	}
	
	public void draw() {
		wrappedWindow.draw();
	}
}
