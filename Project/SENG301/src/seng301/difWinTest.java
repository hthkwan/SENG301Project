package seng301;

import static org.junit.Assert.*;

import org.junit.Test;

public class difWinTest {

	public difWin initialTestContents(){
		difWin test = new difWin();
		return test;
	}
	
	@Test
	public void testDifWin() {
		difWin actual = initialTestContents();
		assertNotNull(actual.getDif());
		assertNotNull(actual.getEb());
		assertNotNull(actual.getMb());
		assertNotNull(actual.getHb());
	}

}
