class Ch20
{
	public static void main(String[]args)
	{
	int start=1,num=6,count=0;
	while(start<=num)
	{
		if(num%start==0)
			{
			System.out.println(start+" is factor of "+num);
			count++;
			}
		start++;
	}
	System.out.println("no.of factors of "+num+" is :"+count);
}
}