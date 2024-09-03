import java.util.Scanner;
class Ch20
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int num=s.nextInt();
	int largest=0,sec_largest=0,temp=num;
	for(;num>0;num=num/10)
	{
		int remainder=num%10;
		if(remainder>largest)
		{
			sec_largest=largest;
			largest=remainder;
		}
		else if(remainder>=sec_largest)
			sec_largest=remainder;
	}
	System.out.println("largest digit of the "+temp+" is "+largest);
	System.out.println("second largest digit of the "+temp+" is "+sec_largest);
	}
		
}
		