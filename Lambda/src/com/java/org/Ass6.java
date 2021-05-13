package com.java.org;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Ass6 {

	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<>();

		n.add("Priya");
		n.add("Rithika");
		n.add("Suganya");
		n.add("Ashwini");
		n.add("Jeni");
		n.add("Sakthi");
		n.replaceAll(t -> t.toUpperCase());

		System.out.println(n);

	}

}
