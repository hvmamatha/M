package strings;

public class CompareTo {

	public static void main(String[] args) {
		String s1="Apple",s2="APpple";
		if(s1.compareTo(s2)==0)
			System.out.println("s1 and s2 are equal");
		else if(s1.compareTo(s2)>0)
			System.out.println("s1 is greater than s2");
		else
			System.out.println("s1 is lesser than s2");
		System.out.println(s2.compareToIgnoreCase(s1));
			
	}

}
