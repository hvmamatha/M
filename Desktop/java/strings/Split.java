package strings;

public class Split {

	public static void main(String[] args) {
		String s="hello all good morning";
		String s2="";
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			String temp=arr[x];
			for(int y=0;y<temp.length();y++)
			{
				if(y==0 || y==temp.length()-1)
				{
					s2=s2+Character.toUpperCase(temp.charAt(y));
				}
				else 
				{
					s2=s2+temp.charAt(y);
				}
			}
			s2=s2+" ";
		}
		System.out.println(s2);
	}

}
