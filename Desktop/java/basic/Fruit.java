import java.util.Scanner;

public class Fruit
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int muskp=20,pinep=20,sapotap=20,orangep=25,bananap=25,papayap=30,waterp=30,mangop=35,badamp=25,carrotp=30,pomop=30,applep=35,mosambip=35,sugarp=25,total=0;
		System.out.println("Welcome to the fruit juice center");
		do
		{
			System.out.println("CHOOSE AMONG THE THSES JUICES ");
			System.out.println("1.musk melon\n2.Pine apple\n3.sapota\n4.orange\n5.banana\n6.papaya\n7.water melon\n8.mango\n9.badam milk\n10.carrot\n11.pomogranate\n12.apple\n13.mosambi\n14.sugar cane");
			int juices=s.nextInt();
			int quantity;
			if(juices==1)
			{	
				System.out.println("you choose musk melon");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*muskp);
			}
			else if(juices==2)
			{	
				System.out.println("you choose pine apple");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*pinep);
			}
			else if(juices==3)
			{	
				System.out.println("you choose sapota");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*sapotap);
			}
			else if(juices==4)
			{	
				System.out.println("you choose orange");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*orangep);
			}
			else if(juices==5)
			{	
				System.out.println("you choose banana");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*pinep);
			}
			else if(juices==6)
			{	
				System.out.println("you choose papaya");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*papayap);
			}
			else if(juices==7)
			{	
				System.out.println("you choose water melon");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*waterp);
			}
			else if(juices==8)
			{	
				System.out.println("you choose mango");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*mangop);
			}
			else if(juices==9)
			{	
				System.out.println("you choose badam milk");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*badamp);
			}
			else if(juices==10)
			{	
				System.out.println("you choose carrot");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*carrotp);
			}
			else if(juices==11)
			{	
				System.out.println("you choose pomogranate");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*pomop);
			}
			else if(juices==12)
			{	
				System.out.println("you choose apple");
				System.out.println("enter quqntity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*applep);
			}
			else if(juices==13)
			{	
				System.out.println("you choose mosambi");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*mosambip);
			}
			else if(juices==14)
			{	
				System.out.println("you choose sugar cane");
				System.out.println("enter quantity");
				quantity=s.nextInt();
				if(quantity>10)
					System.out.println("sorry enter a number<10");
				else
					total=total+(quantity*sugarp);
			}
			else
			{
				System.out.println("enter a number between 1 and 14");
			}
			System.out.println("do you want to continue");
			char dec=s.next().charAt(0);
			if(dec=='n')
				{
					System.out.println("your total price is"+total);
					System.out.println("visit the shop again");
					break;
				}
		}
		while(true);
				
		}
	}


