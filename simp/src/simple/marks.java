package simple;

import java.util.Scanner;

public class marks {
int m1,m2,m3;

private void Subject()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the mark of sub m1");
	int m1 = sc.nextInt();
	System.out.println("Enter the mark of sub m2");
	int m2 = sc.nextInt();
	System.out.println("Enter the mark of sub m3");
	int m3 = sc.nextInt();
	
	System.out.println("the mark of a"+m1);
	System.out.println("the mark of b"+m2);
	System.out.println("the mark of c"+m3);
	
	if(m1>=60 && m2>=60 && m3>+60)
	{
		System.out.println("PASSED");
	}
		else if (m1>=60 && m2>60 || m1>=60&&m3>=60||m2>+60&&m3>+60)
		{
			System.out.println("PROMOTED");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}

