package tast;

public class Lønmodtager {
	private double inkomest;
	private double fradrage;


	public Lønmodtager(double inkomest, double fradrage) {
		this.inkomest = inkomest;
		this.fradrage = fradrage;
	}

	public Lønmodtager(double inkomest, double fradrage, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public double getInkomestSkat() {
		return inkomest - (inkomest - fradrage) * (26.6 / 100);
	}

	public double getBundSkatSkat() {
		return inkomest - (inkomest - fradrage) * (11.15 / 100);
	}

	public double getTopSkatSkat() {
		if ((inkomest - 498900) > 0 && inkomest > 43800) {
			return inkomest - (inkomest - 498900) * (4.25 / 100) + inkomest - (inkomest - 498900) * (14.27 / 100);
		} else
			return 0;

	}

}
