package strings;

public class PalindromeString {

	public static void main(String[] args) {
		String s1="hello",s2="";
		for(int x=s1.length()-1;x>=0;x--)
		{
			s2=s2+s1.charAt(x);
		}
		System.out.println(s2);
		if(s1.equals(s2))
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	}

}
