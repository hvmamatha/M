package module1;

public class Add_element {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50,60,0};
		int index=3,element=80;
		for(int x=a.length-1;x>index;x--)
		{
			a[x]=a[x-1];
		}
		a[index]=element;
		for(int t:a)
			System.out.print(t+" ");

	}

}
