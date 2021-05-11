package Amstrong;

import java.util.Scanner;

public class CUIApplication {
	public static void main (String[] args ) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int flag=0;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter User id");
			String user=sc.next();
			System.out.println("Enter Password");
			String pswd=sc.next();
			if(user.equals("Priya")&&pswd.equals("dharshini")) {
				System.out.println("Welcome");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Contact admin");
		}
		sc.close();
}
}
