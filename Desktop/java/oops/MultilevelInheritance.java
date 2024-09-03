package oops;

public class MultilevelInheritance {

	public static void main(String[] args) {
		Subclass2 g=new Subclass2();
		g.display();
		g.display1();
		g.display2();
		System.out.println(g.land);
		System.out.println(g.gold);
		System.out.println(g.car);
		
	}

}
class Super
{
	int land=3;
	void display()
	{
		System.out.println("i am parent/super class display method");
	}
	
}
class Subclass1 extends Super
{
	String gold="100 gms";
	void display1()
	{
		System.out.println("i am child/subclass1 display1 method");
	}
	
}
class Subclass2 extends Subclass1
{
	String car="Audi";
	int land=6;
	void display()
	{
		System.out.println("i am super class2 display method");
	}
	void display2()
	{
		System.out.println("i am grandchild/subclass2 display2 method");
	}
	
}