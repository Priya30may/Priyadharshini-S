package simple;

import java.util.Scanner;

public class compoundint {
public static void main (String[] args)
{
	double amount;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a principle");
	int prin = sc.nextInt();
	System.out.println("enter a rate");
	double rate=sc.nextDouble();
	for(int n=1;n<=10;n++)
	{
		amount=prin*Math.pow(1+rate , n);
		System.out.println("the amount is "+ " "+n +" "+amount);
		
	}
}
}
