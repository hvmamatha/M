package oops;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		Child3 c3=new Child3();
		c1.display();
		c2.display();
		c3.display();
		System.out.println(c1.land);
		System.out.println(c1.car);
		System.out.println(c2.gold);
		System.out.println(c3.houses);
		System.out.println(c3.land);
		
	}

}
class parent1
{
	int land=3;
	void display()
	{
		System.out.println("i am parent/super class display method");
	}
	
}
class Child1 extends parent1
{
	int land=4;
	String car="audi";
	void display()
	{
		System.out.println("i am Child1/subclass1 class display method");
	}
	
}
class Child2 extends parent1
{
	String gold="200gms";
	void display()
	{
		System.out.println("i am Child2/subclass2 class display method");
	}
}
class Child3 extends parent1
{
	int houses=3;
	int land=9;
	void display()
	{
		System.out.println("i am Child3/subclass3 class display method");
	}
}
