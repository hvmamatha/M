package module1;

public class bubble {

	public static void main(String[] args) {
		int a[]=new int[] {62,45,71,5,6,11};
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a.length-2;y++)
			{
				if(a[y]>a[y+1])
				{
					int t=a[y];
					a[y]=a[y+1];
					a[y+1]=t;
				}	
			}
		}
		for(int t:a)
			System.out.print(t+" ");
	}
}
