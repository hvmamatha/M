class Ch20
{
	public static void main(String[]args)
	{
	int num=141,rev=0,temp=num;
	while(num>0)
	{
		int remainder=num%10;
		rev=rev*10+remainder;
		num=num/10;
	}
	System.out.println(rev);
	if(rev==temp)
		System.out.println("Palindrome number");
	else
		System.out.println("not a palindrome number");
	}
}
	