package Skat;

public class L�nmodtager {
	private double inkomest;
	private double fradrag;
	private boolean gift;
	private double �gtef�lleFradrag;
	private double �gtef�lleInkomest;

	public L�nmodtager(double inkomest, double fradrag) {
		this.inkomest = inkomest;
		this.fradrag = fradrag;
	}

	public L�nmodtager(double inkomest, double �gtef�lleInkomest, double fradrag, double agtef�lleFardrag,
			boolean gift) {
		this(inkomest, fradrag);
		this.�gtef�lleFradrag = agtef�lleFardrag;
		this.�gtef�lleInkomest = �gtef�lleInkomest;
		this.gift = gift;
	}

	public double getInkomestSkat() {
		if (isGift())
			return beregninginkomest(inkomest, fradrag) + beregninginkomest(�gtef�lleInkomest, �gtef�lleFradrag);
		else

			return beregninginkomest(inkomest, fradrag);
	}

	public double getBundSkat() {
		if (isGift())
			return beregningBundSkat(inkomest, fradrag) + beregningBundSkat(�gtef�lleInkomest, �gtef�lleFradrag);
		else
			return beregningBundSkat(inkomest, fradrag);

	}

	public double getTopSkat() {
		if (isGift()) {
			if ((inkomest + �gtef�lleInkomest - (498900 * 2)) > 0 && inkomest + �gtef�lleInkomest > 87600) {
				return beregningTopSkat( inkomest)+beregningTopSkat( �gtef�lleInkomest);
						
			} else
				return 0;
		} else {
			if ((inkomest - 498900) > 0 && inkomest > 43800) {
				return beregningTopSkat( inkomest);
			} else
				return 0;

		}
	}

	public boolean isGift() {
		return gift;
	}

	private double beregninginkomest(double inkomest, double fradrag) {
		return inkomest - (inkomest - fradrag) * 0.266;
	}

	private double beregningBundSkat(double inkomest, double fradrag) {
		return inkomest - (inkomest - fradrag) * 0.1115;
	}
	private double beregningTopSkat(double inkomest) {
		return inkomest - (inkomest - 498900) * 0.0425  + inkomest - (inkomest - 498900) * 0.1427 ;
	}

}
