package com.java.org;

import java.util.ArrayList;

public class Ass4 {

	public static void main(String[] args) {
		
	
	ArrayList<String>n=new ArrayList<String>();
	
	n.add("Savitha");
	n.add("Patrick");
	n.add("Jessil");
	n.add("Bijou");
	n.add("Nitiya");
	n.add("Tharini");
	
	System.out.println(n);
	
	n.removeIf(t->(t.length()%2==1));
	System.out.println(n);
	
//	 na.stream()
//	.filter(p->(p.length()%2==1))
//	.forEach(p->System.out.println("\n"+p));

	
	}
	
}
