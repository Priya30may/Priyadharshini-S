package Amstrong;

public class Amstrongnum {
public static void main (String[] args ) {
	// TODO Auto-generated method stub
	int c=0,a,temp;
	int n=153;
	temp=n;
	while(n>0)
{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
		}
	if(temp==c)
		System.out.println("amstrong number");
	else
		System.out.println("amstrong number");
}
}
