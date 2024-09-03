class Hello{
	public static void main(String[]args)
	{
	 int age=26;
	 int year=2024;
	 
	 if(age>50){
		System.out.println("senior citizen "); 
		String quali="grad";
		if(quali=="grad")
		System.out.println("old eligible for MLC");
		else
		System.out.println("old not elible for MLC"); }
	 else if(age>=18)
	 {
		system.out.println("eligible to vote");
		if(age>=25)
		{
		if(year<=2020)
		system.out.println("youth eligible for MLC");
		else
		system.out.println("youth not eligible for MLC");
		}
		else
		System.out.println("youth is eligible to vote,but not MLC");
	}
        else
		System.out.println("minor");
}
}
		
		
			