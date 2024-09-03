package module1;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		int a1[]=new int[] {20,12,35,46};
		Arrays.sort(a1);
		for (int t:a1)
			System.out.println(t+" ");
		System.out.println();
		System.out.println();
		
		
		int a[]=new int[] {10,20,30,40,50,60};
		int b[]=new int[a.length/2];
		int c[]=new int[a.length/2];
		for(int x=0,y=0;y<=b.length-1;x++,y++)
		{
			b[y]=a[x];
			
		}
		for(int t:b)
			System.out.print(t+" ");
		System.out.println();
		for(int x=a.length/2,y=0;y<=c.length-1;x++,y++)
		{
			c[y]=a[x];
			
		}
		
		for(int t:c)
			System.out.print(t+" ");

	}

}
