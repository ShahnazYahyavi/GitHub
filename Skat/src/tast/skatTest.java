package tast;

import static org.junit.Assert.*;

import org.junit.Test;

import Skat.Lønmodtager;

public class skatTest {

	@Test
	public void testBegeneInkomestSkat() {
		Lønmodtager skat = new Lønmodtager(400000, 46000);

		double inkomestSkat = 400000 - (400000 - 46000) * (26.6 / 100);
		assertEquals(inkomestSkat, skat.getInkomestSkat(), 1);
	}

	@Test
	public void testBegeneBundSkat() {
		Lønmodtager skat = new Lønmodtager(400000, 46000);

		double bundSkat = 400000 - (400000 - 46000) * (11.15 / 100);
		assertEquals(bundSkat, skat.getBundSkat(), 1);
	}

	@Test
	public void testBegeneTopSkat() {
		Lønmodtager skat = new Lønmodtager(400000, 46000);
		double inkomest = 400000;
		double topSkat = 400000 - 498900;

		if (topSkat > 0 && inkomest > 43800) {
			topSkat = 400000 - (400000 - 498900) * (14.27 / 100);
			double a = 400000 - (400000 - 498900) * (4.25 / 100);
			topSkat = topSkat + a;
		} else
			topSkat = 0;

		assertEquals(topSkat, skat.getTopSkat(), 1);
	}

	@Test
	public void testBegeneInkomestSkatMedægtefælle() {

		Lønmodtager skat = new Lønmodtager(400000, 400000, 46000, 34500, true); // den lønmotager er gift

		double inkomestSkat = (400000 - (400000 - 46000) * (26.6 / 100)) + (400000 - (400000 - 34500) * (26.6 / 100));

		assertEquals(inkomestSkat, skat.getInkomestSkat(), 1);
	}
	@Test
	public void testBegeneBundSkatTilLønmodtagerMedÆgtefælle() {
		Lønmodtager skat = new Lønmodtager(400000, 400000, 46000, 34500, true);

		double bundSkat = 400000 - (400000 - 46000) * (11.15 / 100)+(400000 - (400000 - 34500) * (11.15 / 100));
		assertEquals(bundSkat, skat.getBundSkat(), 1);
	}
	@Test
	public void testBegeneTopSkatMedægtefælle() {
		Lønmodtager skat = new Lønmodtager(400000, 400000, 46000, 34500, true);
		double inkomest = 400000+400000;
		double topSkat = 400000 - 498900;

		if (topSkat > 0 && inkomest > 86600) {
			topSkat = 400000 - (400000 - 498900) * (14.27 / 100);
			double a = 400000 - (400000 - 498900) * (4.25 / 100);
			topSkat = topSkat + a;
		} else
			topSkat = 0;

		assertEquals(topSkat, skat.getTopSkat(), 1);
	}

	
}
