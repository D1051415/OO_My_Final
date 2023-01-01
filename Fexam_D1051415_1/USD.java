package fexam_D1051415_1;

// US Dollar
public class USD extends Currency {
	// Complete the implementation of the constructors.
	public USD(double a) {set(a);}
	public USD(NTD d) {set(d.get() * 0.032);}
	public USD(JPY d) {set(d.get() * 0.0075);}
	
	public double get() {return amount;}
	public void set(double a) {amount = a;}
	// Complete the implementation of function printc().
	public void printc() {System.out.println(get() + "$");}

}
