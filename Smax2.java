package module1;

public class Smax2 {

	public static void main(String[] args) {
		int a[]=new int[] {50,40,30,20,10};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				smax=max;
				max=a[x];	
			}
			else if(a[x]>smax && a[x]!=max)
				smax=a[x];
		}
		System.out.println("max :"+max);
		System.out.println("smax :"+smax);
	}

}
