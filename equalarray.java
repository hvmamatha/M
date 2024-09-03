import java.util.Scanner;
class ArrayEqual
{
	public static void main(String[]args)
	{
	 int x=0,y=0,count=0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the size of the  first array");
	 int size1=s.nextInt();
	 System.out.println("enter the size of the  second array");
	 int size2=s.nextInt();
	 int a[]=new int[size1];
	 int b[]=new int[size2];
	 System.out.println("enter first array "+a.length+" elements");
	 for(;x<a.length;x++)
	 {
		a[x]=s.nextInt();
	 }
	 System.out.println("enter second array "+b.length+" elements");
	 for(;y<b.length;y++)
	 {
		b[y]=s.nextInt();
	 }
	 if(a.length==b.length)
	 (
	 	 for(int i=0;i<=a.length-1;i++)
	    	 {
	     		 if(a[i]==b[i])
				count++;
	  	 }
	 )

	 else
		System.out.println("not equal arrays);
	 	 
	}
}

