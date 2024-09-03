public class Strong_class
{

	public static void main(String[] args)
	{
		Myclass s1=new Myclass();
		s1.display(143,0,0,143);
	}

}

class Myclass
{
	void display(int num,int count,int sum,int num1)
	{
		
		for(;num>0;num=num/10)
		{
			 int rem=num%10;
			 int temp=rem;
			 int fact=1;
			 while(temp>=1)
			 {
			    fact=fact*temp;
			    temp--;
			  }	
			 sum=sum+fact;
		}	 
		
		if(sum==num1)
			System.out.println(num1+" is strong number");
		
	}
}
