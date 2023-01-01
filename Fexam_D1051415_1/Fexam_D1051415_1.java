package fexam_D1051415_1;

public class Fexam_D1051415_1 {

	public static void main(String[] args) {
		  NTD n; // Concrete object of NTD.
		  USD u1, u2; // Concrete object of USD.
		  JPY j; // Concrete object of JPY. 
  
  	/*
    	The foreign exchange policy in Taiwan requires that any foreign currency 
	    exchange buying or selling must be via New Taiwan Dollar. 
        Suppose a person is going to buy US Dollar using 300,000 Japanese Yen. 
        Write a main function to compute his/her exchange gain/loss, 
        if he/she could directly buy US Dollar using Japanese Yen.
  	*/
		Double jpd = 300000.0;
		System.out.println("\n現在他/她有" + jpd.intValue() + "￥");
		j = new JPY(jpd);

		System.out.print("\n直接用「日圓」買的美元: ");
		u1 = new USD(j);
		u1.printc();

		System.out.print("\n用「日圓」先換成台幣再買的美元: ");
		n = new NTD(j);
		u2 = new USD(n);
		u2.printc();

		if(u1.get() > u2.get())
		{
			System.out.println("\n直接用日圓買的美元，\n會比用日圓換成台幣買的美元還賺!\n一共賺了 " + (u1.get() - u2.get()) + "$");	
		}

		else if(u1.get() < u2.get())
		{
			System.out.println("\n直接用日圓買的美元，\n會比用日圓換成台幣買的美元還虧!\n一共虧了 " + (u2.get() - u1.get()) + "$");	
		}

		else
		{
			System.out.println("\n不賺也不虧!");	
		}
	}
}