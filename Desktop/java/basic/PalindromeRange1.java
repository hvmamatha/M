import java.util.Scanner;

public class PalindromeRange1 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int start=s.nextInt();
		int end=s.nextInt();
		int count=0,rev=0,temp;
		for(;start<=end;start++)
		{
			temp=start;
			while(temp>0)
			{
				int remainder=temp%10;
				rev=rev*10+remainder;
				temp=temp/10;
			}
			if(rev==start)
			{
				System.out.println(start+" is palindrome");
				count++;
			}
			rev=0;
		}
		System.out.println("no.of palindrome numbers are :"+count);

	}

}
