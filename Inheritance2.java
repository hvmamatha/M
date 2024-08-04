package oops;

public class Inheritance2 {

	public static void main(String[] args) 
	{
		grandchild gc=new grandchild();
		gc.add();
		
	}

}
class parent
{
	int x=10;
	parent()
	{
		System.out.println("parent");
		
	}
	
}
class child extends parent
{
	int y=20,x=30;
	child()
	{
		super();
		System.out.println("child");
		
	}
	
}
class grandchild extends child
{
	int z=40;
	grandchild()
	{
		super();
		System.out.println("grandchild");
	}
	void add()
	{
		int x=100,y=200,z=300;
		System.out.println(super.x+super.y+this.z);
		
	}
	
}