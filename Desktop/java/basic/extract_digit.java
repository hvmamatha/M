import java.util.Scanner;
class Ch20
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int num=s.nextInt();
	while(num>0)
	{
		int remainder=num%10;
		System.out.println(remainder);
		num=num/10;
	}
	
}}
		