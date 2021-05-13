package com.java.org;

import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();

		Sum add = (c, d) -> c + d;
        System.out.println("for addition=" + add.operation(a, b));
        
        Sum sub = (c, d) -> c - d;
		System.out.println("for subsraction=" + sub.operation(a, b));

		Sum mul = (c, d) -> c * d;
		System.out.println("for multiplication=" + mul.operation(a, b));

		Sum div = (c, d) -> c / d;
		System.out.println("for division=" + div.operation(a, b));

		
		

	}

}

interface Sum {
	float operation(int a, int b);

}