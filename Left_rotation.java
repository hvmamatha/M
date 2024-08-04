package module1;

public class Left_rotation {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50};
		int temp=a[0];
		for(int x=0;x<=a.length-1-x;x++)
		{
			a[x]=a[x+1];
		}
		a[a.length-1]=temp;
		for(int t:a)
			System.out.print(t+" ");
	}

}
