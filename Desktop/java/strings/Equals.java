package strings;

public class Equals {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("Hello");
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		//System.out.println(s4==sb); == only used to compare same datatypes
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s4.equals(sb));
		
	
	}

}
