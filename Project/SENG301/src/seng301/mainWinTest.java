package seng301;

import static org.junit.Assert.*;
import org.junit.Test;

public class mainWinTest {
	
	public mainWin initialTestContents(){
		mainWin testwin = new mainWin();
		return testwin;
	}
	
	@Test
	public void testMainWin() {
		mainWin actual = initialTestContents();
	    assertNotNull(actual.getStart());
	    assertNotNull(actual.getRule());
	    assertNotNull(actual.getShop());
	    assertNotNull(actual.getMoney());
	    assertNotNull(actual.getName());
	}


}
