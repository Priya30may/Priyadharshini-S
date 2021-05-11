package Amstrong;

import java.util.Scanner;

public class Averagescore {
	int stud1,stud2,stud3;
	int mark;
	int i,j,k;
	int A1,A2,A3;
	int B1,B2,B3;
	int C1,C2,C3;
	void studOne() {
		System.out.println("Enter the marks of student 1");
		Scanner a1=new Scanner(System.in);
		Scanner a2=new Scanner(System.in);
		Scanner a3=new Scanner(System.in);
		A1=a1.nextInt();
		A2=a2.nextInt();
		A3=a3.nextInt();
		System.out.println("The total score of student 1 is "+ (A1+A2+A3));
		System.out.println("The average score of student 1  is "+((A1+A2+A3)/3));
		
	}
	void studTwo()
	{
		System.out.println("Enter the marks of student 2");
		Scanner b1=new Scanner(System.in);
		Scanner b2=new Scanner(System.in);
		Scanner b3=new Scanner(System.in);
		B1=b1.nextInt();
		B2=b2.nextInt();
		B3=b3.nextInt();
		System.out.println("The total score of student 2 is "+ (B1+B2+B3));
		System.out.println("The average score of student 2  is "+((B1+B2+B3)/3));
	}
	void studThree() {
		System.out.println("Enter the marks of student 3");
		Scanner c1=new Scanner(System.in);
		Scanner c2=new Scanner(System.in);
		Scanner c3=new Scanner(System.in);
		C1=c1.nextInt();
		C2=c2.nextInt();
		C3=c3.nextInt();
		System.out.println("The total score of student 3 is "+ (C1+C2+C3));
		System.out.println("The average score of student 3  is "+((C1+C2+C3)/3));
	}
	void sunject() {
		System.out.println("For subjevt 1: ");
		System.out.println("Total score :"+ (A1+B1+C1)+"\nAverage is :"+((A1+B1+C1)/3));
		System.out.println("For subjevt 2: ");
		System.out.println("Total score :"+ (A2+B2+C2)+"\nAverage is :"+((A2+B2+C2)/3));
		System.out.println("For subjevt 3: ");
		System.out.println("Total score :"+ (A3+B3+C3)+"\nAverage is :"+((A3+B3+C3)/3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Averagescore fine=new Averagescore();
		fine.studOne();
		fine.studTwo();
		fine.studThree();
		fine.sunject();
		
	}

}

