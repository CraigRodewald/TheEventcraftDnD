import static org.junit.Assert.*;

import org.junit.Test;

public class testEvercraft {

	@Test
	public void testGetName() {
		String name= "Calvin";
		Character character = new Character();
		character.setName(name);
		assertEquals("Calvin", character.getName());
	}
	
	@Test
	public void testGetAlignment() {
		String alignment= "good";
		Character character = new Character();
		character.setAlignment(alignment);
		assertEquals("good", character.getAlignment());
	}
	
	@Test
	public void testGetHitPoints() {
		MainClass main = new MainClass();
		Character character = new Character();
		character.setArmorClass(10);
		main.setHitpoints(character);
		
		assertEquals(5, character.getHitPoints());
	}
	
	@Test
	public void testGetAttackHit() {
		MainClass main = new MainClass();
		Character character = new Character();
		Character opponent = new Character();
		opponent.setArmorClass(10);
		main.setHitpoints(opponent);
		character.setAttack(12);
		
		assertEquals(true, main.getAHit(character, opponent));
	}
	
	@Test
	public void testGetAttackMiss() {
		MainClass main = new MainClass();
		Character character = new Character();
		Character opponent = new Character();
		opponent.setArmorClass(12);
		main.setHitpoints(opponent);
		character.setAttack(10);
		
		assertEquals(false, main.getAHit(character, opponent));
	}
	
	@Test
	public void testDamageIfRollNotEqualTo20() {
		MainClass main = new MainClass();
		Character character = new Character();
		Character opponent = new Character();
		opponent.setArmorClass(10);
		main.setHitpoints(opponent);
		character.setAttack(12);
		main.causeDamage(character, opponent);
		
		assertEquals(4, opponent.getHitPoints());
	}
	
	@Test
	public void testDamageIfRollEqualTo20() {
		MainClass main = new MainClass();
		Character character = new Character();
		Character opponent = new Character();
		opponent.setArmorClass(10);
		main.setHitpoints(opponent);
		character.setAttack(20);
		main.causeDamage(character, opponent);
		
		assertEquals(3, opponent.getHitPoints());
	}
	/*
	@Test
	public void testDeadCharacter() {
		MainClass main = new MainClass();
		Character character = new Character();
		Character opponent = new Character();
		opponent.setArmorClass(10);
		opponent.setHitPoints(0);
		character.setAttack(12);
		
		assertEquals("Character is dead", main.causeDamage(character, opponent));
	}*/
}
