package tast;

import static org.junit.Assert.*;



import org.junit.Test;

public class skatTest {

	@Test
	public void testBegeneInkomestSkat() {
		Skat skat= new Skat();
		double inkomest=400000;
		double fradrag= inkomest-46000;
		double inkomestSkat= inkomest-(inkomest-fradrag)*(26.6/100);
		assertEquals(inkomestSkat,skat.getInkomestSkat(),1);
	}

}
