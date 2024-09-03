package strings;

public class ReverseS {

	public static void main(String[] args) {
		String s="hello123";
		String s2="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(x==0)
			{
				s2=s2+(s.charAt(s.length()-1));
			}
			else if(x==s.length()-1)
			{
				s2=s2+(s.charAt(0));
			}
			else
				s2=s2+c;
		}
		System.out.print(s2);
	}

}
