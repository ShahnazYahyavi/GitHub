package tast;



public class Skat {
private double inkomest=400000;
private double fradrage=46000;


public double getInkomestSkat() {
return inkomest-(inkomest-fradrage)*(26.6/100);
}




}
