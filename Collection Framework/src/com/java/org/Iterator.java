package com.java.org;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Iterator {

	public static  void main(String[] args) {
		

		ArrayList <Object> n=new ArrayList<>();
		n.add("Priya");
		n.add("Ramya");
		n.add("Vidya");
		n.add("Harini");
		n.add("Geeta");
		n.add("Illakiya");
	
		n.add(3);
		
		System.out.println(n);
		
		ListIterator<Object>  l= n.listIterator(n.size());
		
		while(l.hasPrevious())
		{
			Object s=l.previous();
			System.out.println(s);
			
			
			
		}
		

	}

}
