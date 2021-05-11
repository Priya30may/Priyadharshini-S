package simple;

import java.util.Scanner;

public class simpleintrest {
public static void main(String[] args)
{
	double amount;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a principal");
	int prin = sc.nextInt();
	System.out.println("enter a rate");
Double rate = sc.nextDouble();
	System.out.println("enter a time");
	int time = sc.nextInt();
	amount = (prin*rate*time)/100;
	System.out.println("The amount is " + " " +amount);
	
}
}
