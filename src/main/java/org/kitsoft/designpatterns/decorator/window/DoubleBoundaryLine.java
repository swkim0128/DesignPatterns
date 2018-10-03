package org.kitsoft.designpatterns.decorator.window;

public class DoubleBoundaryLine extends WindowDecorator {
	public DoubleBoundaryLine(Window w) {
		super(w);
	}
	
	public void draw() {
		super.draw();
		System.out.println("DoubleBoundaryLine draw");
	}

}
