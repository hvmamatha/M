class Ch20{
	public static void main(String[]args)
	{
	int num=145,sum=0,num2=num;
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
		sum=sum+fact;
	}
	if(sum==num2)
		System.out.println("Strong number");
	else
		System.out.println("not a strong number");
	}
}
		

	