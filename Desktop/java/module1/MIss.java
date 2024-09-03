package module1;

public class MIss {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,5,6,7,8,9};
		int i=1,m=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]!=i)
			{
				m=i;
				break;
			}
			i++;
		}
		System.out.println(m);
	}

}
