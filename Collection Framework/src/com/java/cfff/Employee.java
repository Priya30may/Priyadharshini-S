package com.java.cfff;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Employee {

   public Boolean equals()
   {
	return true;
	      
   }
   
   public int Hashcode()
   {
	return 2;
	   
   }

}

class navin{
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		Boolean n1= e.equals();
		int  n2=e.Hashcode();
		
		HashMap nav=new HashMap();
		Set s1=nav.entrySet();
				
	    nav.put(n1, "priya");
		nav.put(n2, "pavithra");
		nav.put(4, "patrick");
			
		System.out.println(s1);
		System.out.println(nav.get(true));
		System.out.println(nav.getOrDefault(1, e));
		
	}
	
}
