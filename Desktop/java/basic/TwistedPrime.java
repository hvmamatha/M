import java.util.Scanner;
class TwistedPrime
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number:");
	int temp=s.nextInt();
	int sum=0,rem,count1=0,count2=0,num=0;
	for(int i=1;i<=temp;i++)
	{
		 if(temp%i==0)
			count1++;
	}
	if (count1==2)
		num=temp;
	while(num>0)
	{
	 	rem=num%10;
		sum=sum*10+rem;
		num=num/10;
	}
	for(int i=1;i<=sum;i++)
	{
		if(sum%i==0)
			count2++;
	}
	if(count2==2)
		System.out.println("twisted prime");
	else
		System.out.println("not a twisted prime");
	}
}