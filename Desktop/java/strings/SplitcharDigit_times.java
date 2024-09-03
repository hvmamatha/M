package strings;

public class SplitcharDigit_times {

	public static void main(String[] args) {
		String s="a2b3c4";
		int num=0;
		char ch;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isDigit(c))
			{
				num=Character.getNumericValue(c);
				ch=s.charAt(x-1);
				for(int y=1;y<=num;y++)
				{
					System.out.print(ch);
				}
			}
		}

	}

}
