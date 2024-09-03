package oops;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("welcome to the JNTU portal");
		while(true)
		{
		
		System.out.println("1:Are you 12th pass\n2:Are you UG pass");
		int i=s.nextInt();
		if(i==1)
		{
			System.out.println("choose your UG courses");
			System.out.println("1:B.TECH\n2:BSc");
			int z=s.nextInt();
			if(z==1)
			{
				System.out.println(" you choose B.Tech");
				BTech b=new BTech();
			}
			else if(z==2)
			{
				System.out.println("you choose BSc");
				BSc b1=new BSc();
			}
			else
			{
				System.out.println("enter the valid input");
				
			}
		}
		else if(i==2)
		{
			System.out.println("choose your PG courses");
			System.out.println("1:M.Tech\n2:MBA");
			int z=s.nextInt();
			if(z==1)
			{
				System.out.println("you choose M.Tech");
				MTech m=new MTech();
			}
			else if(z==2)
			{
				System.out.println("you choose MBA");
				MBA m1=new MBA();
			}
			else
			{
				System.out.println("enter the valid input");
			}
		}
		else
			System.out.println("Thank you for visiting the portal");
		}
	}

}
class UG
{
	UG()
	{
		
	}
}
class PG
{
	PG()
	{
		
	}
}
class BTech extends UG
{
	BTech()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("SELECT YOUR BRANCH IN B.TECH");
		System.out.println("1:CSE\n2:ECE\n3:CIVIL\n4:MECHANICAL\n5:CHEMICAL\n6:EEE\n7:INFORMATION TECHNOLOGY");
		int i=s1.nextInt();
		switch(i)
		{
		case 1:System.out.println("you choose CSE");
			   break;
		case 2:System.out.println("you choose ECE");
			   break;
		case 3:System.out.println("you choose CIVIL");
			    break;
		case 4:System.out.println("you choose MECHANICAL");
	    		break;
		case 5:System.out.println("you choose CHEMICAL");
				break;
		case 6:System.out.println("you choose EEE");
	    		break;
		case 7:System.out.println("you choose INFORMATION TECHNOLOGY");
	    		break;
	    default:
	    	   System.out.println("enter the valid input");
	    	   break;
		}
	}
}
class BSc extends UG
{
	BSc()
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("choose your branch in BSc");
		System.out.println("1:BSc in Physics\n2:BSc in Chemistry\n3:BSc in Biology (or Biotechnology)\n4:BSc in Mathematics\n5:BSc in Computer Science\n6:B.Sc.in Food Technology\n7:BSc in Environmental Science\n8:BSc in Nursing");
		int i2=s2.nextInt();
		switch(i2)
		{
		case 1:System.out.println("you choose BSc in Physics ");
		break;
		case 2:System.out.println("you choose BSc in Chemistry ");
		break;
		case 3:System.out.println("you choose BSc in Biology ");
		break;
		case 4:System.out.println("you choose BSc in Mathematics ");
		break;
		case 5:System.out.println("you choose BSc in Computer Science ");
		break;
		case 6:System.out.println("you choose BSc in Food technology ");
		break;
		case 7:System.out.println("you choose BSc in Environmental Science ");
		break;
		case 8:System.out.println("you choose BSc in Nursing ");
		break;
		default:
			System.out.println("enter the valid input");
			 break;
		}
	}
}
class MTech extends PG
{
	MTech()
	{
		Scanner s3=new Scanner(System.in);
		System.out.println("choose your branch in MTech");
		System.out.println("1:M.Tech.Structural Engineering\n2: M.Tech. Geo-Technical Engineering\n3:M.Tech. Infrastructure Engineering\n4:M.Tech. Power Electronics\n5:M.Tech. Thermal Engineering\n6:M.Tech. Advanced Manufacturing Systems");
		int i3=s3.nextInt();
		switch(i3)
		{
		case 1:System.out.println("you choose M.Tech.Structural Engineering ");
		break;
		case 2:System.out.println("you choose M.Tech.Geo-Technical Engineering ");
		break;
		case 3:System.out.println("you choose M.Tech.Infrastructure Engineering ");
		break;
		case 4:System.out.println("you choose M.Tech.Power electronics");
		break;
		case 5:System.out.println("you choose M.Tech.Thermal Engineering ");
		break;
		case 6:System.out.println("you choose M.Tech.Advanced Manufacturing Engineering ");
		break;
		default:
			System.out.println("enter the valid input");
			break;
		}
				
		
	}
	
}
class MBA extends PG
{
	MBA()
	{
		Scanner s4=new Scanner(System.in);
		System.out.println("choose your branch in MBA");
		System.out.println("1:MBA Finance\n2:MBA Marketing\n3:MBA Human Resource Management\n4:MBA International Business\n5:MBA Banking&Financial services\6:MBA in Entrepreneurship\n7:MBA in Economics");
		int i4=s4.nextInt();
		switch(i4)
		{
		case 1:System.out.println("you choose MBA Finance");
				break;
		case 2:System.out.println("you choose MBA Marketing");
				break;
		case 3:System.out.println("you choose MBA Human Resoucre Management");
				break;
		case 4:System.out.println("you choose MBA International Business");
				break;
		case 5:System.out.println("you choose MBA Banking&Financial Services");
				break;
		case 6:System.out.println("you choose MBA in Enetrepreneurship");
				break;
		case 7:System.out.println("you choose MBA Economics");
				break;
		default:
			System.out.println("enter the valid input");
			break;
		}
	}
}