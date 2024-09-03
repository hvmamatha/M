package strings;

public class SplitSum2 {

	public static void main(String[] args) {
		String s="hello12 all 11 & 177";
		//output= 12+11+177
		int n=0,sum=0;
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			n=0;
			String temp=arr[x];
			//System.out.println(temp);
			for(int y=0;y<temp.length();y++)
			{
				char c=temp.charAt(y);
				if(Character.isDigit(c))
					n=n*10+Character.getNumericValue(c);
			}
			System.out.println(temp+" num is :"+n);
			sum=sum+n;
		}
		System.out.println("sum of the numbers in string is:"+sum);
	}

}
