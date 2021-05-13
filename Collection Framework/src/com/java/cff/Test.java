package com.java.cff;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Test {
	public static void main(String[] args) {
        Emp e1 = new Emp("Sanjay");
        Emp e2 = new Emp("Rithika");
        Emp e3 = new Emp("Janavi");
        Date d1 = new Date(21, 12, 2005);
        Date d2 = new Date(21, 8, 2004);
        Date d3 = new Date(4, 7, 2016);
       
        Map<Date, Emp> m1 = new HashMap<Date, Emp>();
        m1.put(d1,e1);
        m1.put(d1,e2);
        m1.put(d1,e3);
        m1.put(d2,e1);
        m1.put(d2,e2);
        m1.put(d3,e3);
        for(Map.Entry<Date,Emp> entry: m1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
