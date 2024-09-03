class Ch20
{
	public static void main(String[]args)
	{
	int start=1,num=6,sum=0;
	while(start<num)
	{
		if(num%start==0)
		{
			System.out.println(start+" is factor of "+num);
			sum+=start;
		}
		start++;
	}
	System.out.println("sum of factors of "+num +" is "+sum );
	if(sum==num)
		System.out.println("perfect number");
	else
		System.out.println("not a perfect number");

	}
}