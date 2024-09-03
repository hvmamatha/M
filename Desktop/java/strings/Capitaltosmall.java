package strings;

public class Capitaltosmall {

	public static void main(String[] args) {
		String s="ApPlE";
		String s2="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isUpperCase(c))
				c=Character.toLowerCase(c);
			else if(Character.isLowerCase(c))
				c=Character.toUpperCase(c);
			else if(Character.isDigit(c))
				System.out.print("digit");
			s2=s2+c;
		}
		System.out.print(s2);

	}

}
