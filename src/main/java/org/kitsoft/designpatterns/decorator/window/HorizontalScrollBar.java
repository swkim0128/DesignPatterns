package org.kitsoft.designpatterns.decorator.window;

public class HorizontalScrollBar extends WindowDecorator {
	public HorizontalScrollBar(Window w) {
		super(w);
	}
	
	public void draw() {
		super.draw();
		System.out.println("HorizontalScrollBar draw");
	}

}
