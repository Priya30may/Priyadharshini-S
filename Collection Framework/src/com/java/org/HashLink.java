package com.java.org;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashLink {

	public static void main(String[] args) {
		
       
		HashSet<String> n=new HashSet<>();
		n.add("Priya");
		n.add("Ramya");
		n.add("Vidya");
		n.add("Harini");
		n.add("Geeta");
		n.add("Illakiya");
		
		System.out.println("Unorderd "+n);
		
		LinkedHashSet<String> ln=new LinkedHashSet<String>();
		
		ln.add("Priya");
		ln.add("Ramya");
		ln.add("Vidya");
		ln.add("Harini");
		ln.add("Geeta");
		ln.add("Illakiya");
		
		System.out.println("Orderd "+ln);
		
		
		
	}

}
