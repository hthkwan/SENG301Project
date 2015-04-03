package seng301;

import static org.junit.Assert.*;

import org.junit.Test;

public class gameRuleTest {

	public gameRule initialTestContents() {
		gameRule game = new gameRule();
		return game;
	}
	
	@Test
	public void testGameRule() {
		gameRule actual = initialTestContents();
		assertNotNull(actual.getBack());
		assertNotNull(actual.getPrev());
		assertNotNull(actual.getNext());
		assertNotNull(actual.getTxt());
		assertNotNull(actual.getTxt2());
		assertNotNull(actual.getImg());
	}

}
