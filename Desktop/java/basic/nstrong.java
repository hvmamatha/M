//import java.util.Scanner;
class StrongRange
{
	public static void main(String[]args)
      {
	 /*Scanner s=new Scanner(System.in);
	 System.out.println("enter the starting value:");
	 int start=s.nextInt();
	 System.out.println("enter the ending value:");
	 int end=s.nextInt();*/
	 
	 for(int start=1000;start>=1;start--)
	 {
		int sum=0;
		 int temp=start;
		for(;temp>0;temp=temp/10)
		{
			int rem=temp%10;
			for(int fact=1;rem>=1;rem--)
			{
				fact=fact*rem;
				sum=sum+fact;						
			}
			
		if(sum==temp)
		System.out.println(sum+" is strong number");	
		}
			
	}
	
			
	}
	
	
 }

	