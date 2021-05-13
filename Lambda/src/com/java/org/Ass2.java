package com.java.org;
import java.util.Scanner;

public class Ass2 {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Amount");
		
		int price=sc.nextInt();
		
		if(price>10000)
		{
		 System.out.println(" Accepted");
		    
		}
		else
		{
			System.out.println("Denied");
			
			
			
		}
		
	}
	
	
}

