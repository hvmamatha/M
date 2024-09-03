import java.util.Scanner;

public class customExcept{
	public static void main(String[] args) throws VoterException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age<18 || age>=60)
		{
			//try
			//{
			//	throw new VoterException("not eligible to vote");
			//}
			//catch(Exception e)
			//{
			//	System.out.println("not eligible to vote");
			//}
				throw new VoterException("not eligle to vote");	
		}
		else
		{
			System.out.println("welcome voter you eligible for vote");
		}		
	}
}
class VoterException extends Exception
{
	public VoterException()
	{
		super();
	}
	public VoterException(String name)
	{
		super("not eligible to vote");
	}
}
