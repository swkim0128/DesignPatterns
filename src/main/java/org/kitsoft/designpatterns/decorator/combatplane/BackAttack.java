package org.kitsoft.designpatterns.decorator.combatplane;

public class BackAttack extends CombatPlaneDecorator {
	public BackAttack(CombatPlaneImp cp) {
		super(cp);
	}
	
	public void attack() {
		combatPlane.attack();
		System.out.print(", rear");
	}
}
