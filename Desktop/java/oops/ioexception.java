import java.io.*;
class io{
	public static void main(String []args)
	{
	try
	{
		File file=new File("C:\\Users\\hvmam\\Desktop\\new.txt");
		if(file.createNewFile())
		{
			System.out.println("file is created successfully");
		}
		else
		{
			System.out.println("file is already exists");
		}
	}
	catch(IOException e)
	{
		System.out.println("IOException is handled"); 
	}
	}
}
		


