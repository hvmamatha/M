class Ch20{
	public static void main(String[]args){
	int start=1,end=1000;
	for(;start<=end;start++)
	{
		if((start%3==0)&&(start%5==0))
			System.out.println(start+" -FIZZ BUZZ");
		else if(start%3==0)
			System.out.println(start+" -FIZZ");
		else if(start%5==0)
			System.out.println(start+" -BUZZ");
		else
			System.out.println(start);
		
	}
}
}
