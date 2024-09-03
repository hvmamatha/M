import java.util.Scanner;
class Ch20
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int num=s.nextInt();
	int min=9,temp=num;
	for(;num>0;num=num/10)
	{
		int remainder=num%10;
		if(remainder<min)
			min=remainder;
	}
	System.out.println("smallest digit of the "+temp+" is "+min);
	}
		
}
		