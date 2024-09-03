import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the array size");
	  int size=s.nextInt();
	  int a[]=new int[size];
	  System.out.println("enter "+a.length+" elements");
	  for(int x=0;x<=a.length-1;x++)
	  {
		a[x]=s.nextInt();
	  }
	  System.out.println("elements of the array are ");
	  for(int x=0;x<=a.length-1;x++)
	  {
		System.out.println(a[x]);
	  }
	}
}