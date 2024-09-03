import java.io.*;
class allexcept1{
	public static void main(String []args)
	{
	try
	{
		//System.out.println(10/0);
		System.out.println("before exception");
		System.out.println(10/0);
	}
	catch(Exception e)
	{
		//e.printStackTrace();
		System.out.println("exception occurred"); 
	}
	finally
	{
		System.out.println("after exception");
		System.out.println("hi hello bye");
	}
	}
}
