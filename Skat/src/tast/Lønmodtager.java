package tast;



public class Lønmodtager {
private double inkomest;
private double fradrage;

public Lønmodtager(double inkomest,double fradrage) {
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
	// TODO Auto-generated method stub
	return 0;
}




}
