class Ch20
{
	public static void main(String[]args)
	{
	int start=1,end=1000,count=0,sqrt,pow,temp=start;
	for(;start<=end;start++)
	{
		sqrt=(int)(Math.sqrt(start));
		pow=(int)(Math.pow(sqrt,2));
		if(start==pow)
		{	System.out.println(start+" is perfect square");
			count++;
		}
		else
			System.out.println(start+" is not a perfect square");

	}
	System.out.println("no.of perfect squares between "+temp+" to "+end+" is "+ count);
	
	}
}