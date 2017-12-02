package tast;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class skatTest {

	@Test
	public void testBegeneInkomestSkat() {
		BigDecimal inkomestSkat;
		BigDecimal løn;
		BigDecimal fraDrag;
		assertEquals(305.836,skat.getInkomestSkat);
	}

}
