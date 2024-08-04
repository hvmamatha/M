package strings;

public class MostRepeatChar {

	public static void main(String[] args) {
		String s="hello all";
		char[] array = s.toCharArray();
		int count = 1;
		int max = 0;
		char maxChar = 0;
		for(int i=1; i<=array.length-1; i++)
		{ 
			if(array[i]==array[i-1])
				   count++; 
			else
			{
				if(count>max)
				{  
				    max=count;
				    maxChar=array[i-1];
				}
				count = 1;
		    }
		}
		if(count>max)
		{
			 max=count; 
			 maxChar=array[array.length-1];
	    }
		System.out.println("Longest run: "+max+", for the character :"+maxChar);

	}

}
