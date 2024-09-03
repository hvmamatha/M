class Ch20{
	public static void main(String[]args)
	{
	int num=123;
	for(;num>0;num=num/10)
	{
		int fact=1;
		int remainder=num%10;
		System.out.println(remainder+"! is ");
		int temp=remainder;
		while(temp>=1)
		{
		fact=fact*temp;
		 temp--;
		}
	System.out.println(fact);
	}
	
	}
}
		

	