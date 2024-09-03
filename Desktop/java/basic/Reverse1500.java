class Reverse{
	public static void main(String[]args){
	int num=1500,count1=0,rev1=0,count2=0,rev2=0,temp=num;
	for(;num>0;num=num/10)
	{
		int remainder=num%10;
		count1++;
		rev1=rev1*10+remainder;
		
	}
	System.out.println("rev1 value :"+rev1);
	for(;rev1>0;rev1=rev1/10)
	{
	 int remainder2=rev1%10;
	 count2++;
	 rev2=rev2*10+remainder2;
	}
	System.out.println("rev2 value :"+rev2);
	if(temp==rev2)
		System.out.println(temp+" is palindrome");
	else
	{
		int diff=count1-count2;
		int add=(int)(Math.pow(10,diff));
		rev2=rev2*add;
		System.out.println(rev2);
	}
	
	 
}
}