package tast;



public class L�nmodtager {
private double inkomest;
private double fradrage;

public L�nmodtager(double inkomest,double fradrage) {
	this.inkomest=inkomest;
	this.fradrage=fradrage;
}
public double getInkomestSkat() {
return inkomest-(inkomest-fradrage)*(26.6/100);
}
public double getBundSkatSkat() {
		return inkomest-(inkomest-fradrage)*(11.15/100);
}
public double getTopSkatSkat() {
		if(inkomest-498900<0)
		return 0;
	else 
		return inkomest-(inkomest-49800)*(14.27/100);
}




}
