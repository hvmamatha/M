package strings;

public class SplitTimes {

	public static void main(String[] args) {
		String s="a12b13c4";
		int n=0;
        for(int x=0;x<s.length();x++)
        {
        	n=0;
            char c = s.charAt(x);
            if (Character.isAlphabetic(c))
            {
                for(int y=x+1;y<s.length();y++)
                {
                	char ch=s.charAt(y);
                	if(Character.isDigit(ch))
                		n=n*10+Character.getNumericValue(ch);
                	else
                		break;
                }
            }
            for(int z=1;z<=n;z++)
            	System.out.print(c);
         }
          
	}

}
