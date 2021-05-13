package com.java.org;

import java.util.*;

public class HeightWeight implements Comparable {
	int weight;
	int height;
	String name;

	HeightWeight(int weight, int height, String name) {
		this.height = height;
		this.weight = weight;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		int weight1 = this.weight;
		int height1 = this.height;
		HeightWeight p = (HeightWeight) o;
		int weight2 = p.weight;
		int height2 = p.height;
		if (weight1 < weight2) {
			return -1;
		} else if (weight1 > weight2) {
			return +1;
		} else {
			if (height1 < height2) {

				return -1;
			} else if (height1 > height2) {
				return 1;
			}

		}
		return height2;

	}
}

class Sortmain {

	public static void main(String[] args) {
		HeightWeight p1 = new HeightWeight(59, 5, "Priya");
		HeightWeight p2 = new HeightWeight(66, 7, "Shriya");
		HeightWeight p3 = new HeightWeight(45, 8, "Dhivya");
		HeightWeight p4 = new HeightWeight(45, 6, "Sanjay");
		HeightWeight p5 = new HeightWeight(45, 4, "Jerome");

		TreeSet<HeightWeight> n = new TreeSet<>();
		n.add(p1);
		n.add(p2);
		n.add(p3);
		n.add(p4);
		n.add(p5);
		System.out.println(n);

	}
}