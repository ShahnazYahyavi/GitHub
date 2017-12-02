package tast;

public class L�nmodtager {
	private double inkomest;
	private double fradrage;
	private boolean gift;
	private double �gtef�lleFradrag;
	private double �gtef�lleInkomest;

	public L�nmodtager(double inkomest, double fradrage) {
		this.inkomest = inkomest;
		this.fradrage = fradrage;
	}

	public L�nmodtager(double inkomest,double �gtef�lleInkomest, double fradrage, double agtef�leFardrag,boolean gift) {
		this(inkomest, fradrage);
		this.�gtef�lleFradrag=agtef�leFardrag;
		this.�gtef�lleInkomest=�gtef�lleInkomest;
		this.gift = gift;
	}

	public double getInkomestSkat() {
		if(isGift())
			return inkomest - (inkomest - fradrage) * (26.6 / 100)+
					�gtef�lleInkomest - (�gtef�lleInkomest - �gtef�lleFradrag) * (26.6 / 100);
		else
			
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
	public void setFradrage(double fradrage) {
		this.fradrage=fradrage;
	}

	public boolean isGift() {
		return gift;
	}

}
