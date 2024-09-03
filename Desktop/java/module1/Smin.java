package module1;

public class Smin {

	public static void main(String[] args) {
		int a[]=new int[] {50,40,30,20,10};
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min)
			{
				smin=min;
				min=a[x];	
			}
			else if(a[x]<smin && a[x]!=min)
				smin=a[x];
		}
		System.out.println("min :"+min);
		System.out.println("smin :"+smin);

	}

}
