package org.kitsoft.designpatterns.decorator.combatplane;

public class CombatPlane implements CombatPlaneImp {
	
	public void attack() {
		System.out.print("CombatPlane possible attack area : front");
	}
}
