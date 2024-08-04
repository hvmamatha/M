package strings;

public class VIRUS {

	public static void main(String[] args) {
		String s="Vital Information Resources Under Seize";
		String s2=" ";
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++) 
		{
			String temp=arr[x];
			for(int y=0;y<temp.length();y++)
			{
				if(y==0)
					s2=s2+temp.charAt(y);
			}
		}
		System.out.println(s2);
			
		}

}
