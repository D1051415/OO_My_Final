package fexam_D1051415_1;

// Japanese Yen
public class JPY extends Currency {
	// Complete the implementation of the constructors.
	public JPY(double a) {set(a);}
	public JPY(USD d) {set(d.get() * 133.52);}
	public JPY(NTD d) {set(d.get() * 4.34);}
	
	public double get() {return amount;}
	public void set(double a) {amount = a;}
	// Complete the implementation of function printc().
	public void printc() {System.out.println(get() + "￥");}

}
