package com.java.org;

import java.util.Comparator;
import java.util.TreeSet;

public class BankAccount {

	int ID;
	int Balance;
	String Name;
	String Salary;

	public BankAccount(int iD, int balance, String name, String salary) {
		super();
		ID = iD;
		Balance = balance;
		Name = name;
		Salary = salary;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Account [ID=" + ID + ", Balance=" + Balance + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

	void WithDraw() {

	}

	void Deposit() {

	}

}

class BankaccList {

	public static void main(String[] args) {

		BankAccount a1 = new BankAccount(1999, 510003, "Priya", "Salary");

		BankAccount a2 = new BankAccount(2005, 510032, "Sanjay", "Salary");

		BankAccount a3 = new BankAccount(2016, 510087, "Janavi", "Salary");

		BankAccount a4 = new BankAccount(2010, 510098, "Charan", "Salary");

		TreeSet<BankAccount> n= new TreeSet<>(new MyComparator());

		n.add(a1);
		n.add(a2);
		n.add(a3);
		n.add(a4);

		System.out.println(n);

	}

}

class MyComparator implements Comparator

{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		if (i1 > i2) {

			return -1;
		} else if (i1 < i2) {
			return 1;

		} else if (i1 == i2) {

		}
		return i1;
	}

}
