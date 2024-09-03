package strings;

public class SplitRevEach {

	public static void main(String[] args) {
		String s="hello all good morning";
		String s2="";
		String s3="";
		String s4="";
		String arr[]=s.split(" ");
		for(int x=0;x<arr.length;x++)
		{
			String temp=arr[x];
			StringBuffer sb=new StringBuffer(temp);
			sb.reverse();
			s2=s2+sb.toString()+" ";
		}
		System.out.println(s2);
		System.out.println();
		for(int x=0;x<arr.length;x++)
		{
			String temp=arr[x];
			StringBuffer sb=new StringBuffer(temp);
			if(x%2!=0) 
			{
				sb.reverse();
				s3=s3+sb.toString()+" ";
			}
			else
				s3=s3+sb.toString()+" ";
			
		}
		System.out.println(s3);
		System.out.println();
		for(int x=0;x<arr.length;x++)
		{
			String temp=arr[x];
			StringBuffer sb=new StringBuffer(temp);
			if(x%2!=0) 
			{
				sb.reverse();
				s4=s4+sb.toString()+" ";
			}
			else
			{
				for(int y=0;y<temp.length();y++)
				{
					char c=temp.charAt(y);
					if(y%2==0)
						s4=s4+Character.toUpperCase(c);
					else
						s4=s4+c;
				}
			}
			s4=s4+" ";
		}
		System.out.println(s4);
		
		
	}

}
