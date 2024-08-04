package strings;

public class Constructor {

	public static void main(String[] args) {
		Student s1=new Student(10,20);
		s1.marks();
	}

}
class Student{
	int a=10;
	int roll=1,m1,m2;
	String name="abc";
	Student(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
		name="xyz";
		
	}
	void marks()
	{
		int a=200;
		System.out.println(roll+" "+name+" "+(m1+m2));
	}
}
