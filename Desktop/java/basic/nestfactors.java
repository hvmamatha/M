class Ch20
{
	public static void main(String[]args)	
	{
	 for(int x=1;x<=10;x++)
	 {
		System.out.println(x +" factors are :");
		for(int y=1;y<=x;y++)
		{
			if(x%y==0)
				System.out.println(y);
		}
		System.out.println();
	}
	}
}