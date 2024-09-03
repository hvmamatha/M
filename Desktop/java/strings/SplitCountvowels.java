package strings;

public class SplitCountvowels {

	public static void main(String[] args) {
		String s="happy new year";
		String s2="";
		String arr[]=s.split(" ");
		int count=0,max=0;
		char c;
		String temp;
		for(int x=0;x<arr.length;x++)
		{
			temp=arr[x];
			count=0;
			for(int y=0;y<temp.length();y++)
			{
				c=temp.charAt(y);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='I'||c=='U')
						count++;
				
			}
			//System.out.println(temp+" - no.of vowels are :"+count);
			if(count>max)
			{
				max=count;
				s2=temp;
			}
		}
		System.out.println("max vowel word in string is :"+s2 +" with no.of vowels is :"+max);
		
	}

}
