package org.kitsoft.designpatterns.decorator.combatplane;

public abstract class CombatPlaneDecorator implements CombatPlaneImp {
	protected CombatPlaneImp combatPlane;
	
	public CombatPlaneDecorator(CombatPlaneImp cp) {
		combatPlane = cp;
	}
	
	public abstract void attack();
}
