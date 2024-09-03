class HelloWorld{
	public static void main(String[]args)
	{
	char c='M';
	if(c>='a'&&c<='z')
	System.out.println("alphabet");
	else if(c>='A'&&c<='Z')
	System.out.println("alphabet");
	else if(c>='0'&&c<='9')
	System.out.println("digit");
	else
	System.out.println("special character");
	}
}