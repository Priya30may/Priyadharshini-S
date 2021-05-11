package Amstrong;

public class RangeAmstrong {
	public static void main (String[] args ) {
		// TODO Auto-generated method stub
		int temp,rem;
		for(int a=100; a<=999; a++)
		{
			int ans=0;
			temp=a;
			while(temp>0)
			{
				rem=temp%10;
				ans=ans+(rem*rem*rem);
				temp=temp/10;
				
			}
			if(ans==a)
			{
				System.out.println(ans);
			}
		}
}
}
