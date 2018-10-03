package org.kitsoft.designpatterns.decorator.combatplane;

public class LeftSideAttack extends CombatPlaneDecorator {
	public LeftSideAttack(CombatPlaneImp cp) {
		super(cp);
	}
	
	public void attack() {
		combatPlane.attack();
		System.out.print(", left side");
	}
}
