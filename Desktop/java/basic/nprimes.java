import java.util.Scanner;
class PrimeRange
{
	public static void main(String[]args)
      {
	 Scanner s=new Scanner(System.in);
	 int start;
	 System.out.println("enter the n value :");
	 int end=s.nextInt();
	 int count,j,n=0;
	 for(start=1;n<=10;start++)
	 {
		count=0;
		for(j=1;j<=start;j++)
		{
			if(start%j==0)
			    count++;
		}
		
		if(count==2)
		{	
			System.out.println(start+" is prime number");
			n++;
	
	}	}
	
      }
}
	