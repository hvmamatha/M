package strings;

public class Buffer {

	public static void main(String[] args) {
		String s1="hello";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1=s1.concat("all");
		System.out.println(s1.hashCode());
		System.out.println();
		StringBuffer sb=new StringBuffer("hello world");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append(" good morning");
		System.out.println(sb);
		System.out.println(sb.hashCode());

	}

}
