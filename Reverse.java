package strings;

public class Reverse {

	public static void main(String[] args) {
		String s1="mom",s2="";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		s2=sb.toString();
		if(s1.equals(s2))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		System.out.println();
		System.out.println();
		String s3="121",s4="";
		StringBuffer sb1=new StringBuffer(s3);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		s4=sb1.toString();
		if(s3.equals(s4))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		
	}

}
