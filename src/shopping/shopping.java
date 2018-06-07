/**
 * 
 */
package shopping;

import java.util.Scanner;

public class shopping {

	/**
	 * @param args
	 */
	static int custno,amt;
	static String name;
	/**
	*Array of objects
	*/
	shopping[] c= new shopping[5];
	
			/**
			*Function for Electronics category
			*/
	public static void Electronics() {
		int pro, qty,amt1;
		Scanner s1 = new Scanner(System.in);
		System.out.println("          ELECTRONICS     ");
		System.out.println("      WELCOME         "+name);
		do {
			/**
			*Display the Electronics menu
			*/
		System.out.println("1.mobile  = 100/-\n2.Laptop  = 1000/-\n3.exit ");
			/**
			*Accept input of the item from user
			*/
		System.out.println("Enter your choice:");
		pro = s1.nextInt();
		if(pro==3)
			return;
			/**
			*Accept input quantity from the user 
			*/
		System.out.println("Enter the quantity");
		qty=s1.nextInt();
		if(pro==1)
		{
			amt1=qty*100;
			amt=amt+amt1;
			
		}
		else
		{
			amt1=qty*1000;
			amt=amt+amt1;
		}
		}while(pro!=3);
		
		
		
		 
		
		
		
	}
	
			/**
			*Function for Category of clothing and fashion includes men and womens section 
			*/
	public static void Fashion() {
		int pro = 0, qty,amt1;
		int i;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("          FASHION    ");
		System.out.println("      WELLCOME         "+name);
		do {
			/**
			*Display the Fashion  menu
			*/
			
			System.out.println("1.Women's fashion   2.Men's fashion");
			int ch = s1.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Welcome to women's fashion !");
					System.out.println("1.Ethnic wear - 3500/- 2.Western wear - 1500/- 3.Bottom wear - 1000/-   4.exit ");
					System.out.println("Enter the product : ");
					 pro = s1.nextInt();
					if(pro==4)
						return;
					System.out.println("Enter the quantity : ");
					qty=s1.nextInt();
					if(pro==1)
					{
						amt1=qty*3500;
						amt=amt+amt1;
						
					}
					if(pro==2)
					{
						amt1=qty*1500;
						amt=amt+amt1;
						
					}
					else
					{
						amt1=qty*1000;
						amt=amt+amt1;
					}
					break;
					
			case 2:  System.out.println("Welcome to men's fashion !");
					System.out.println("1.Shirt - 1500/- 2.Jacket - 2500/- 3.Bottom wear - 1000/-   4.exit ");
					System.out.println("Enter the product : ");
					pro = s1.nextInt();
					if(pro==4)
						return;
					System.out.println("Enter the quantity : ");
					qty=s1.nextInt();
					if(pro==1)
					{
						amt1=qty*1500;
						amt=amt+amt1;
				
					}
					if(pro==2)
					{
						amt1=qty*2500;
						amt=amt+amt1;
				
					}
					else
					{
						amt1=qty*1000;
						amt=amt+amt1;
					}
					break;
					
			default : System.out.println("Enter a valid choice !  ");
						break;
			 
					
			}
			
			

		}while(pro!=4);
		
	}
	
			/**
			*Function for categories of books
			*/
	
	public static void Books() {
		int pro, qty,amt1;
		Scanner s1 = new Scanner(System.in);
		System.out.println("          BOOKS    ");
		System.out.println("      WELLCOME         "+name);
		do {
			/**
			*Display the Fashion  menu
			*/
		System.out.println("1.ABCD  = 100/-\n2.NOPQ = 1000/-\n3.exit ");
			/**
			*Accept input of the item from user
			*/
		System.out.println("Enter the product");
		pro = s1.nextInt();
		if(pro==3)
			return;
			/**
			*Accept input quantity from the user 
			*/
		System.out.println("Enter the quantity");
		qty=s1.nextInt();
		if(pro==1)
		{
			amt1=qty*100;
			amt=amt+amt1;
		}
		else
		{
			amt1=qty*1000;
			amt=amt+amt1;
		}
		}while(pro!=3);
		
	}

	/**
	*Function for categories of sports
	*/


public static void Sports() {
int pro, qty,amt1;
Scanner s1 = new Scanner(System.in);
System.out.println("          SPORTS    ");
System.out.println("      WELLCOME         "+name);
do {
	/**
	*Display the Sports  menu
	*/
System.out.println("1.Football  = 100/-\n2.Badminton = 1000/-\n3.Exit ");
	/**
	*Accept input of the item from user
	*/
System.out.println("Enter the product");
pro = s1.nextInt();
if(pro==3)
	return;
	/**
	*Accept input quantity from the user 
	*/
System.out.println("Enter the quantity");
qty=s1.nextInt();
if(pro==1)

{
	amt1=qty*100;
	amt=amt+amt1;
}
else
{
	amt1=qty*1000;
	amt=amt+amt1;
}
}while(pro!=3);

}
			/**
			*Billing function
			 * @return 
			*/
	public static int Bill() {
			/**
			*Display the Name and Customer number
			*/
	System.out.println("NAME:"+name+ "\tCUST No:"+custno);
			/**
			*Display the total price
			*/
	System.out.println("\n\ntotal amount is "+amt+"Rs");
	
	return 0;
	}
	
			/**
			*Main function
			*/
	public static void main(String[] args) {
		int choice;
		
		shopping[] c = new shopping[5];
		Scanner s=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter your custno");
		custno=s.nextInt();
		System.out.println("Enter your name ");
		name=s2.next();
		do {
			/**
			*Display the various categories of the shop
			*/
			System.out.println("1.Electronics\n 2.Fashion\n 3.Books\n 4.Sports\n 5.Bill");
			System.out.println("Enter your choice");
			choice=s.nextInt();
			switch(choice)
			{
			case 1: Electronics();
			break;
			case 2: Fashion();
			break;
			case 3: Books();
			break;
			case 4: Sports();
			break;
			case 5: Bill();
			break;
			}
		}while(choice!=5);

	}

}
