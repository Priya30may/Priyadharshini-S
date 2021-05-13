package com.java.org;

import java.util.ArrayList;
import java.util.Arrays;

public class Ass5 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		Arrays.asList("Priya","Rithu","janani","divya")
		.forEach(n->sb.append(n.charAt(0)));
		
		System.out.println(sb);
		
	}

}
