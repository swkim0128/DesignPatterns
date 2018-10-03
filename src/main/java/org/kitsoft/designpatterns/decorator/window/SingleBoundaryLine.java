package org.kitsoft.designpatterns.decorator.window;

public class SingleBoundaryLine extends WindowDecorator {
	public SingleBoundaryLine(Window w) {
		super(w);
	}
	
	public void draw() {
		super.draw();
		System.out.println("SingleBoundaryLine draw");
	}
}
