package strings;

public class Merge {

	public static void main(String[] args) {
		String s1="Hibye";
		String s2="hello";
		String s3="";
		//System.out.println(s1.length());
		for(int x=0;x<s1.length()/2;x++)
		{
			s3=s3+s1.charAt(x);
		}
		//System.out.println(s3);
		for(int x=0;x<s2.length();x++)
		{
				s3=s3+s2.charAt(x);
		}
		for(int x=s1.length()/2;x<s1.length();x++)
		{
			s3=s3+s1.charAt(x);
		}
		System.out.println(s3);
		
	}

}

