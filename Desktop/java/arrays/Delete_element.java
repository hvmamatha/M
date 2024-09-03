package module1;

public class Delete_element {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,80,40,50};
		int b[]=new int[a.length-1];
		int index=3;
		for(int x=0,y=0;x<=a.length-1;x++)
		{
			if(x!=index)
			{	
				b[y]=a[x];
				y++;
			}	
		}
		for(int t:b)
			System.out.print(t+" ");

	}

}
