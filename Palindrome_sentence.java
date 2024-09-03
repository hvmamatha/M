package strings;

public class Palindrome_sentence {

	public static void main(String[] args) {
		String s1="a man a plan @ a canal ? panama";
		String s2="",s3="";
		for(int x=0;x<=s1.length()-1;x++)
		{
			
			if((s1.charAt(x)>='a' && s1.charAt(x)<='z') || (s1.charAt(x)>='A' && s1.charAt(x)<='Z'))
				s2=s2+s1.charAt(x);
			
		}
		System.out.println(s2);
		StringBuffer sb=new StringBuffer(s2);
		sb=sb.reverse();
		s3=sb.toString();
		System.out.println(s3);
		if(s2.equalsIgnoreCase(s3))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");

	}

}
