package strings;

public class EvenCapital {

	public static void main(String[] args) {
		String s="hello",s2="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(x%2==0)
				c=Character.toUpperCase(c);
			else
				c=Character.toLowerCase(c);
			s2=s2+c;
		}
		System.out.print(s2);
		

	}

}
