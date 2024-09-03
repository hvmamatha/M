package strings;

public class SplitSumdigit {

	public static void main(String[] args) {
		String s="madam 12arora2 teaches5 malayalam";
		//   sum=        1+2+2+    5=10
		int sum=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isDigit(c))
			{
				int num=Character.getNumericValue(c);
				//System.out.println(num);
				sum=sum+num;
			}
		}
		System.out.println(sum);

	}

}
