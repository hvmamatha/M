class Ch20
{
	public static void main(String[]args)	
	{
	 for(int num=11;num<=20;num++)
	 {
		System.out.println(num +" sum of digits is :");
		int sum=0,temp=num;
		for(;temp>0;temp=temp/10)
		{
			int remainder=temp%10;
			sum=sum+remainder;
		}
		System.out.println(sum);
	}
	}
}