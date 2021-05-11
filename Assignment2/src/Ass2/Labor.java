package Ass2;


	public class Labor extends Employee {
		int overtime_hrs=1;
		public double getSalary()
		{
		Labor l1=new Labor();
		return(l1.basic_pay+l1.hra-l1.tax+(l1.overtime_hrs)*1000);
		}

		}

