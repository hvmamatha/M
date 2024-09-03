import java.util.Scanner;
class Ch20
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int num=s.nextInt();
	int sum=0,product=1;
	for(;num>0;num=num/10)
	{
		int remainder=num%10;
		if(remainder%2==0)
			sum=sum+remainder;
		else
			product=product*remainder;
		
	}
	System.out.println("sum of the even digits of the number is:"+sum);
	System.out.println("product of the odd digits of the number is:"+product);
	
	}
}
		