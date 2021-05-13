package com.java.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestFail {

	
	public static void main(String[] args) {
		
		HashSet<Object> n=new HashSet();
		
		n.add("Priya");
		n.add("Janavi");
		n.add(21);
		n.add(5);

		Iterator i=n.iterator();
		 while(i.hasNext())
		   {
			   
			   Object a=i.next();
			   n.add("Charan");
			   System.out.println(a);
			   
			   
			   
		   }
	
}
	}
