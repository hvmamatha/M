public class DownCast{
	public static void main(String[] args)
	{
	 Child c=new Parent();
	 c.m2();
	}
}
class Parent
{
	void m1()
	{
	System.out.println("m1");
	}
}
class Child extends Parent
{
	void m2()
	{
	 System.out.println("m2");
	}
}

