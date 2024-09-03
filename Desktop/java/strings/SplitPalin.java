package strings;

public class SplitPalin {

	public static void main(String[] args) {
		String s="madam arora teaches malayalam";
		String s2="";
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			s2="";
			String temp=arr[x];
			StringBuffer sb=new StringBuffer(temp);
			sb.reverse();
			s2=s2+sb.toString();//if s2=sb.toString(); there is no need to assign s2=""; again in the for loop
			if(s2.equalsIgnoreCase(temp))
			{
				System.out.println(temp);
				
			}
		}
		
		/*
		 for(int x=0;x<arr.length;x++)
		{
			
			String temp=arr[x];
			StringBuffer sb=new StringBuffer(temp);
			sb.reverse();
			s2=sb.toString();//if s2=sb.toString(); there is no need to assign s2=""; again in the for loop
			if(s2.equalsIgnoreCase(temp))
			{
				System.out.println(temp);
				
			}
		}
		 */
	}

}
