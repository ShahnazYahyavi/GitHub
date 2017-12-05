package Skat;

public class Lønmodtager {
	private double inkomest;
	private double fradrag;
	private boolean gift;
	private double ægtefælleFradrag;
	private double ægtefælleInkomest;

	public Lønmodtager(double inkomest, double fradrag) {
		this.inkomest = inkomest;
		this.fradrag = fradrag;
	}

	public Lønmodtager(double inkomest, double ægtefælleInkomest, double fradrag, double agtefælleFardrag,
			boolean gift) {
		this(inkomest, fradrag);
		this.ægtefælleFradrag = agtefælleFardrag;
		this.ægtefælleInkomest = ægtefælleInkomest;
		this.gift = gift;
	}

	public double getInkomestSkat() {
		if (isGift())
			return beregninginkomest(inkomest, fradrag) + beregninginkomest(ægtefælleInkomest, ægtefælleFradrag);
		else

			return beregninginkomest(inkomest, fradrag);
	}

	public double getBundSkat() {
		if (isGift())
			return beregningBundSkat(inkomest, fradrag) + beregningBundSkat(ægtefælleInkomest, ægtefælleFradrag);
		else
			return beregningBundSkat(inkomest, fradrag);

	}

	public double getTopSkat() {
		if (isGift()) {
			if ((inkomest + ægtefælleInkomest - (498900 * 2)) > 0 && inkomest + ægtefælleInkomest > 87600) {
				return beregningTopSkat( inkomest)+beregningTopSkat( ægtefælleInkomest);
						
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
