package strings;

public class UniqueDuplicates {

	public static void main(String[] args) {
		String s1="hello";
		String s2="",s3="";
		System.out.println("unique elements are :");
		for(int x=0;x<s1.length();x++)
		{
			char c=s1.charAt(x);
			if(s1.indexOf(c)==s1.lastIndexOf(c))
				System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("duplicate elements are :");
		for(int y=0;y<s1.length();y++)
		{
			char c1=s1.charAt(y);
			if(s1.indexOf(c1)!=s1.lastIndexOf(c1))
			{	
				if(s2.indexOf(c1)==-1)
				{	
					s2=s2+c1;	
				}	
			}
				
		}
		System.out.print(s2);
		System.out.println();
		System.out.println("all elements are :");
		for(int x=0;x<s1.length();x++)
		{
			char c=s1.charAt(x);
			if(s3.indexOf(c)==-1)
				s3=s3+c;
		}
		System.out.print(s3);
	}

}
