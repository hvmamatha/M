import java.io.*;
import java.sql.*;
class ThrowsThrow
{
	public static void main(String[] args)throws SQLException,IOException,ArithmeticException
	{
		int a=10,b=20;
		if(a>b)
		{
			try
			{
				throw new IOException();
			}
			catch(Exception e)
			{
				System.out.println("IOException is handled"); 
			}
		}
		else if(a==b)
		{
			try
			{
				throw new ArithmeticException();
			}
			catch(Exception e)
			{
				System.out.println("ArithmeticException is handled"); 
			}
		}

		else
		{
			try
			{
				throw new SQLException();
			}
			catch(Exception e)
			{
				System.out.println("SQLException is handled"); 
			}
		}

	}
}
