class Ch20{
	public static void main(String[]args)
	{
	int start=10,end=1,product=1;
	while(start>=end)
	{

		product=product*start;
		start--;
	}
	System.out.println(product);
	}
}