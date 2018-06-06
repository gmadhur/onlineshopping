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
			*Function for Category of clothing and fashion 
			*/
	public static void Fashion() {
		int pro, qty,amt1;
		int i;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("          FASHION    ");
		System.out.println("      WELLCOME         "+name);
		do {
			/**
			*Display the Fashion  menu
			*/
		System.out.println("1.Shirt  = 100/-\n2.Pant  = 1000/-\n 3.exit");
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
			*Billing function
			*/
	public static void Bill() {
			/**
			*Display the Name and Customer number
			*/
	System.out.println("NAME:"+name+ "\tCUST No:"+custno);
			/**
			*Display the total price
			*/
	System.out.println("\n\ntotal amount is "+amt+"Rs");
	
	
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
			System.out.println("1.Electronics\n 2.Fashion\n 3.Books\n 4.Bill");
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
			case 4: Bill();
			}
		}while(choice!=4);

	}

}
