import java.util.Scanner;
class Ch20
{
	void display()
	{
	
	int sum=0,count=0,temp=num;
	for(;num>0;num=num/10)
	{
		int remainder=num%10;
		count++;
	}
	num=temp;
	for(;num>0;num=num/10)
	{
		int remainder=num%10;
		int power=(int)(Math.pow(remainder,count));
		sum=sum+power;
	}
	if(sum==temp)
		System.out.println("ARMSTRONG NUMBER");
	else
		System.out.println("NOT A ARMSTRONG NUMBER");
		
	}
		
}
public class armstrongclass
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
	        int num=s.nextInt();
		Ch20 n2=new Ch20();
		n2.display();
	}
}
	

		