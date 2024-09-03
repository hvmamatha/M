class HelloWorld{
	public static void main(String[]args)
	{
	String d="driver";
	int age=40;
	String gender="female";
	String status="unmarried";
		
		if(gender=="male" && status=="unmarried" && age>30)
			System.out.println("insurance is applied");
		else if(gender=="female" && status=="unmarried" && age>25)
			System.out.println("insurance is applied");
		else if(status=="married")
			System.out.println("insurance is applied");
		else
			System.out.println("not eligible to insurance");
	}
}