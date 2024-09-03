class Ch20{
	public static void main(String[]args){
	int start=1900,end=2024;
	while(start<=end)
	{
		if((start%4==0)&&(start%100!=0)||(start%4000==0))
			System.out.println(start+" is leap year");
		else
			System.out.println(start+"is not leap year");
		start++;
	}
}
}
