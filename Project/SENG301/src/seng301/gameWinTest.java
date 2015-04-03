package seng301;

import static org.junit.Assert.*;

import org.junit.Test;

public class gameWinTest {
	
	public gameWin initialTestContents(){
		gameWin game = new gameWin();
		return game;
	}
	
	@Test
	public void testGameWin() {
		gameWin actual = initialTestContents();
		assertNotNull(actual.getCard1());
		assertNotNull(actual.getCard2());
		assertNotNull(actual.getCard3());
		assertNotNull(actual.getCard4());
		assertNotNull(actual.getCard5());
		assertNotNull(actual.getCard6());
		assertNotNull(actual.getCard7());
		assertNotNull(actual.getCard8());
		assertNotNull(actual.getCard9());
		assertNotNull(actual.getCard10());
		assertNotNull(actual.getCard11());
		assertNotNull(actual.getCard12());
		assertNotNull(actual.getCard13());
		assertNotNull(actual.getEndGame());
		assertNotNull(actual.getGameWin());
	}

}
