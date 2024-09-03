import java.util.Scanner;
class Twinprime
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int count1=0,count2=0,diff=(num2-num1);
		for(int start=1;start<=num1;start++)
		{
			if(num1%start==0)
				count1++;
		}
		for(int start=1;start<=num2;start++)fg
		{
			if(num2%start==0)
				count2++;
		}
		if(diff==2 && count1==2 && count2==2 && diff=-2 && diff==2)
			System.out.println("Twin prime numbers");
		else
			System.out.println("not Twin prime numbers");
	}
}
	