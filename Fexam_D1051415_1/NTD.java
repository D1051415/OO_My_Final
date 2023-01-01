package fexam_D1051415_1;

// New Taiwan Dollar
public class NTD extends Currency {
	// Complete the implementation of the constructors.
	public NTD(double a) {set(a);}
	public NTD(USD d) {set(d.get() * 30.78);}
	public NTD(JPY d) {set(d.get() * 0.23);}
	
	public double get() {return amount;}
	public void set(double a) {amount = a;}
	// Complete the implementation of function printc().
	public void printc() {System.out.println(get() + "NT$");}

}
