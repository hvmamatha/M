import java.util.Scanner;
class Ch20
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int num=s.nextInt();
	int smallest=9,sec_smallest=0,temp=num;
	for(;num>0;num=num/10)
	{
		int remainder=num%10;
		if(remainder<smallest)
		{
			sec_smallest=smallest;
			smallest=remainder;
		}
		else if(remainder<=sec_smallest)
			sec_smallest=remainder;
	}
	System.out.println("smallest digit of the "+temp+" is "+smallest);
	System.out.println("second smallest digit of the "+temp+" is "+sec_smallest);
	}
		
}
		