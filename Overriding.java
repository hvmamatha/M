package oops;

public class Overriding 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee(1,"ari","developer","7LPA");
		e1.display();
	}

}
class Employee
{
	int id;
	String name,salary,designation;
	Employee(int id,String name,String designation,String salary)
	{
		//this("7LPA");
		this(salary);
		this.id=id;
		this.name=name;
		this.designation=designation;
	}
	Employee(String salary)
	{
		this.salary=salary;
	}
	void display()
	{
		System.out.println("employee id :"+id);
		System.out.println("employee name is :"+name);
		System.out.println("employee salary is:"+salary);
		System.out.println("employee designation:"+designation);
	}
	

}
