package strings;

public class SubString {

	public static void main(String[] args) {
		String s1="abc";
		for(int x=0;x<s1.length();x++)
		{
			System.out.println(s1.charAt(x));
		}
			System.out.println(s1.substring(0,s1.length()-1));
			System.out.println(s1.substring(1,s1.length()));
		
	}

}
