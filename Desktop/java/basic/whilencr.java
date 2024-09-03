class Ch20{
	public static void main(String[]args)
	{
	int n=5,r=3;
	int sub=n-r;
	int pro1=1,pro2=1,pro3=1;
	while(n>=1)
	{
		pro1=pro1*n;
		n--;
	}
	System.out.println(pro1);
	while(r>=1)
	{
		pro2=pro2*r;
		r--;
	}
	System.out.println(pro2);
	
	while(sub>=1)
	{
		pro3=pro3*sub;
		sub--;
	}
	System.out.println(pro3);
	int mul=pro2*pro3;
	int res=pro1/mul;
	System.out.println(res);
	

}
}