package tast;

import static org.junit.Assert.*;



import org.junit.Test;

public class skatTest {

	@Test
	public void testBegeneInkomestSkat() {
		Skat skat= new Skat();
		
		double inkomestSkat= 400000-(4-46000)*(26.6/100);
		assertEquals(inkomestSkat,skat.getInkomestSkat(),1);
	}

}
