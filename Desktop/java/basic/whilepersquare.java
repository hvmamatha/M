class Ch20{
	public static void main(String[]args){
	int start=1,end=100;
	while(start<=end)
	{
		int a=(int)(Math.sqrt(start));
		int b=(int)(Math.pow(a,2));
		
		System.out.println((start==b)?(start+"is perfect square"):(start+"is not perfect square"));
		start++;
	}
}
}
