package oops;

public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.display();
		c.display1();
		System.out.println(c.land);
		System.out.println(c.gold);
		System.out.println(c.houses);
		System.out.println(c.cars);
	}

}
class Parent
{
	int land=5;
	String gold="100 gms";
	void display()
	{
		System.out.println("i am parent class display method");
	}
}
class Child extends Parent
{
	int cars=2;
	int houses=3;
	void display()
	{
		System.out.println("i am child class display method");
	}
	void display1()
	{
		System.out.println("i am child class display1 method");
	}
}
