package oops;

public class Inheritance {

	public static void main(String[] args) {
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
	int x=20,y=30;
	//int i;
	child()
	{
		//super();
		// i=super.x;
		System.out.println("child");
	}
	
}
class grandchild extends child
{
	int x=40,y=50,z=60;
	grandchild()
	{
		super();
		System.out.println("grandchild");
	}
	void add()
	{
		//int j=super.i;
		System.out.println(super.x+super.y+this.z);
	}
}