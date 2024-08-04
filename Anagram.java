package strings;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		if(s1.length()==s2.length())
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
				System.out.println("Anagrams");
			else
				System.out.println("not anagrams");
		}
		else
			System.out.println("not anagrams");
			
	}

}
