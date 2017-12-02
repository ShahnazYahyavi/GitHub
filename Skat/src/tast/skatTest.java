package tast;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class skatTest {

	@Test
	public void testBegeneInkomestSkat() {
		
		double løn=400000;
		double fraDrag;
		double fradrag= løn-46000;
		double inkomestSkat= løn-(løn-fradrag)*(26.6/100);
		assertEquals(inkomestSkat,skat.getInkomestSkat());
	}

}
