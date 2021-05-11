package Ass2;

	public class Manager extends Employee {
		int incentive = 2000;
		public double getSalary() {
		Manager m1=new Manager();
		return(m1.basic_pay+m1.hra-m1.tax+m1.incentive);
		}
}
