import java.io.*;
import java.util.*;
class allexcept{
	public static void main(String []args)
	{
	try
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int number=s.nextInt();
		System.out.println(10/number);
		int a[]=new int[number];
		System.out.println(a[number]);
	}
	catch(Exception e)
	{
		e.printStackTrace(); 
	}
	}
}
