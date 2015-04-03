package seng301;

import static org.junit.Assert.*;

import org.junit.Test;

public class mainTest {
	
	public main initialTestContents(){
		main prog = new main();
		return prog;
	}

	@Test
	public void testMain() {
		main actual = initialTestContents();
		assertNotNull(actual.getOk());
		assertNotNull(actual.getWelcome());
	}

}
