package strings;

public class UpperLower {

	public static void main(String[] args) {
		String s1="hello@123",s2="";
		s1=s1.toUpperCase();
		System.out.println(s1);
		s2=s1.toLowerCase();
		System.out.println(s2);
		System.out.println(s1.charAt(0));
		for(int x=s1.length()-1;x>=0;x--)
		{
			System.out.println(s1.charAt(x));
		}
		
	}

}
