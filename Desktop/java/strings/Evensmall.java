package strings;

public class Evensmall {
	public static void main(String[]args) {
	String s="hello world",s2="";
	for(int x=0;x<s.length();x++)
	{
		char c=s.charAt(x);
		if(Character.isAlphabetic(c))
		{
			if(x%2==0)
				c=Character.toLowerCase(c);
			else
				c=Character.toUpperCase(c);
			s2=s2+c;
		}
		else
			s2=s2+c;
	}
	System.out.print(s2);
}
}




