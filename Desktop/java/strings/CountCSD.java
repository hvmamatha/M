package strings;

public class CountCSD {

	public static void main(String[] args) {
		String s="hEllo All GoOD MoRNing";
		int sma=0,cap=0,dig=0,spe=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isAlphabetic(c))
			{
				if(Character.isUpperCase(c))
					cap++;
				else if(Character.isLowerCase(c))
					sma++;
			}
			else if(Character.isDigit(c))
				   dig++;
			else
					spe++;
		}
		System.out.println("no.of uppercase letters in string is :"+cap);
		System.out.println("no.of lowercase letters in string is :"+sma);
		System.out.println("no.of digits in string is :"+dig);
		System.out.println("no.of special characters in string is :"+spe);
	}

}
