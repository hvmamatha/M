package module1;

import java.util.Arrays;

public class Smax {

	public static void main(String[] args) {
		int a[]= {50,40,30,20,10};
		Arrays.sort(a);
		for(int t:a)
			System.out.print(t+" ");
		int max=a[a.length-1];
		int smax=a[a.length-2];
		System.out.println();
		System.out.println(max+" "+smax);
		
		
	}

}
