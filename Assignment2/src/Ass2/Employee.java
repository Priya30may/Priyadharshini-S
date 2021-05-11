package Ass2;

public class Employee {
	int basic_pay=10000;
	int hra=1000;
	double tax=0.1*(basic_pay);
	public double getSalary() {
	return(basic_pay+hra-tax);
	}


	}
	

	class Main{
	public static void main(String[] args) {
	Manager m=new Manager();
	System.out.println(m.getSalary());
	Labor l=new Labor();
	System.out.println(l.getSalary());
	}
	}
	

	

