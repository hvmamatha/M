class PrimeRange
{
	public static void main(String[] args) 
	{
		int start=1,end=100,count=0,p=0,temp=start;
		for (;start<=end;start++)
		{
			int num=1;
			count=0;
			while(num<=start)
			{
				if(start%num==0)
					    count++;
				
				num++;
			}
			if(count==2)
				{
				System.out.println(start+" is prime number");
				p++;
				}
					
			else
				System.out.println(start+" is not a prime number");
			
		}
		System.out.println("no.of prime numbers between "+ temp +" to "+end +" is "+p);
	}
		
}


