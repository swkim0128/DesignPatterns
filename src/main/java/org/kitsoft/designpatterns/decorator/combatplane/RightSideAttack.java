package org.kitsoft.designpatterns.decorator.combatplane;

public class RightSideAttack extends CombatPlaneDecorator {
	public RightSideAttack(CombatPlaneImp cp) {
		super(cp);
	}
	
	public void attack() {
		combatPlane.attack();
		System.out.print(", right side");
	}
}
