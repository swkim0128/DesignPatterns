package org.kitsoft.designpatterns.decorator.window;

public class VerticalScrollBar extends WindowDecorator {
	public VerticalScrollBar(Window w) {
		super(w);
	}
	
	public void draw() {
		super.draw();
		System.out.println("VerticalScrollBar draw");
	}
}
