package human;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestingTest {

	@Test
	void testThinking() {
		CreateHuman human = new CreateHuman();
		human.head.think();
		assertNotEquals(human.head.energy, 100);
	}
	
	
	@Test
	void testStretching() {
		CreateHuman human = new CreateHuman();
		human.torso.stretch();
		assertEquals(human.torso.life, 120);
	}
	
	
	@Test
	void testPunch() {
		CreateHuman human = new CreateHuman();
		human.armLeft.punch();
		assertEquals(human.armLeft.energy, 90);
	}
	
	

}
