package tast;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class skatTest {

	@Test
	public void testBegeneInkomestSkat() {
		
		double l�n=400000;
		double fraDrag;
		double fradrag= l�n-46000;
		double inkomestSkat= l�n-(l�n-fradrag)*(26.6/100);
		assertEquals(inkomestSkat,skat.getInkomestSkat());
	}

}
