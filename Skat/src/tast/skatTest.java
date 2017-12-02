package tast;

import static org.junit.Assert.*;



import org.junit.Test;

public class skatTest {

	@Test
	public void testBegeneInkomestSkat() {
		Skat skat= new Skat(400000, 46000);
		
		double inkomestSkat= 400000-(400000-46000)*(26.6/100);
		assertEquals(inkomestSkat,skat.getInkomestSkat(),1);
	}

}
