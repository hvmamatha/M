import java.util.Scanner;
class ArrayRev
{
	public static void main(String[]args)
	{
	
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the size of the  first array");
	 int size1=s.nextInt();
	 int a[]=new int[size1];
	 int b[]=new int[a.length];
	 System.out.println("enter first array "+a.length+" elements");
	 for(int x=0;x<a.length;x++)
	 {
		a[x]=s.nextInt();
		b[x]=a[a.length-1]-x;
	 }
	 for(int y=0;y<=a.length-1;y++)
	 {
 		 System.out.println(b[y]);
	 }
	
}
}
