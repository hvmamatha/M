package module1;

public class Miss1 {

	public static void main(String[] args) {
		int a[]=new int[] {2,3,4,7,8,9};
		int i=a[0];
		for(int x=0;x<a.length;)
		{
			if(a[x]!=i)
			{
				System.out.println(i+" ");
				i++;
			}
			else 
			{
				x++;
				i++;
			}
		}

	}

}
