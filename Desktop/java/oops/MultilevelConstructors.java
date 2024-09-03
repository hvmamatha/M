package oops;

public class MultilevelConstructors {

	public static void main(String[] args) {
		grandchild g=new grandchild(); 
		g.display();
		System.out.println(g.land);
		System.out.println(g.car);
		
	}

}

class Super1
{
	int land;
	String car="audi";
	Super1()
	{
		this.land=4;
		this.car=car;
		System.out.println("i am parent/super class display method");
	}
	
}
class child extends Super1
{
	child()
	{
		System.out.println("i am child/subclass1 display1 method");
	}
	
}
class grandchild extends child
{
	//int land;
	grandchild()
	{
		//this.land=2;
		System.out.println("i am grandchild/subclass2 display2 method");
	}
	void display()
	{
		System.out.println("display");
	}
	
}