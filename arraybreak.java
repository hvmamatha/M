import java.util.Scanner;
class Array
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("enter size of the array:");
       int size=s.nextInt();
       int a[]=new int[size];
       int b[]=new int[a.length/2];
       int c[]=new int[a.length/2];
       int d[]=new int[a.length];
       System.out.println("enter "+a.length+" elements:");
       for(int x=0;x<a.length;x++)
       {
	a[x]=s.nextInt();
       }
	for(int x=a.length/2,y=0; y<b.length; x++,y++)
       {
           b[y]=a[x];
       }
       for(int x=0;x<c.length;x++)
       {
           c[x]=a[x];
       }
      for(int y=b.length-1,z=0,x=0; x<a.length; x++)
       {
           if(y>=0)
           {
               d[x]=b[y];
               y--;
           }
           else if(z<c.length)
           {
               d[x]=c[z];
               z++;
           }
        }
	System.out.println("a array is ");
           for(int t:a)
            	System.out.print(t+"  ");
	   System.out.println("\nb array ");
	   for(int t:b)
            	System.out.print(t+"  ");
	   System.out.println("\nc array ");
	   for(int t:c)
            	System.out.print(t+"  ");
	   System.out.println("\nd array ");
	   for(int t:d)
		System.out.print(t+" ");
    }
}