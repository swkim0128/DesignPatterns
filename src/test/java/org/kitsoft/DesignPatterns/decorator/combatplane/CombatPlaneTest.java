package org.kitsoft.designpatterns.decorator.combatplane;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class CombatPlaneTest {
	private CombatPlaneImp combatPlane;
	
	@BeforeEach
	void setUp() throws Exception {
		combatPlane = new CombatPlane();
	}

	@Test
	void backAtackTest() {
		BackAttack back = new BackAttack(combatPlane);
		back.attack();
		System.out.println("");
	}
	
	@Test
	void leftsideAttack() {
		LeftSideAttack left = new LeftSideAttack(combatPlane);
		left.attack();
		System.out.println("");
	}
	
	@Test
	void rightsideAttack() {
		RightSideAttack right = new RightSideAttack(combatPlane);
		right.attack();
		System.out.println("");
	}

}
