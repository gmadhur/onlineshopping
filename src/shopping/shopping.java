/**
 * @autho 
 */
package shopping;

import java.util.Scanner;


public class shopping {

	/**
	 * @param args
	 */
	static int custno;
	static long amt=0;
	static String name;
	/**
	*Array of objects
	*/
	shopping[] c= new shopping[5];
	
			/**
			*Function for Electronics category
			*/
	public static void Electronics() {
		int pro = 0, qty=0,amt1=0;
		int i;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("          FASHION    ");
		System.out.println("      WELLCOME         "+name);
		do {
			/**
			*Display the Electronics  menu
			*/
			
			System.out.println("1.Mobile   2.Laptop   3.exit");
			int ch = s1.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Welcome to mobile section !");
					System.out.println("1.Moto - 35000/- 2.lenovo - 15000/- 3.Nokia - 10000/-   4.exit ");
					System.out.println("Enter the product : ");
					 pro = s1.nextInt();
					if(pro==4)
						return;
					System.out.println("Enter the quantity : ");
					qty=s1.nextInt();
					if(pro==1)
					{
						amt1=qty*35000;
						amt=amt+amt1;
						
					}
					else if(pro==2)
					{
						amt1=qty*15000;
						amt=amt+amt1;
						
					}
					else if(pro==3)
					{
						amt1=qty*10000;
						amt=amt+amt1;
					}
					break;
					
			case 2:  System.out.println("Welcome to Laptop section!");
					System.out.println("1.Lenovo - 30000/- 2.Dell - 25000/- 3.Acer- 50000/-   4.exit ");
					System.out.println("Enter the product : ");
					pro = s1.nextInt();
					if(pro==4)
						return;
					System.out.println("Enter the quantity : ");
					qty=s1.nextInt();
					if(pro==1)
					{
						amt1=qty*30000;
						amt=amt+amt1;
				
					}
					else if(pro==2)
					{
						amt1=qty*25000;
						amt=amt+amt1;
				
					}
					else if(pro==3)
					{
						amt1=qty*50000;
						amt=amt+amt1;
					}
					break;
			case 3:return;		
					
			default : System.out.println("Enter a valid choice !  ");
						break;
			 
					
			}
			
			

		}while(pro!=4);
		 
		}
		
		
		
		 
		
		
		
		
	
			/**
			*Function for Category of  fashion 
			*/
	public static void Fashion() {
		int pro = 0, qty=0,amt1=0;
		int i;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("          FASHION    ");
		System.out.println("      WELLCOME         "+name);
		do {
			/**
			*Display the Fashion  menu
			*/
			
			System.out.println("1.Women's fashion   2.Men's fashion    3.exit");
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
					else if(pro==2)
					{
						amt1=qty*1500;
						amt=amt+amt1;
						
					}
					else if(pro==3)
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
			case 3:return;		
					
			default : System.out.println("Enter a valid choice !  ");
						break;
			 
					
			}
			
			

		}while(pro!=4);
		
	}
	
			/**
			*Function for categories of books
			*/
	
	public static void Books() {
		int pro = 0, qty=0,amt1=0;
		int i;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("          BOOKS    ");
		System.out.println("      WELLCOME         "+name);
		do {
			/**
			*Display the Electronics  menu
			*/
			
			System.out.println("1.Novel   2.Educational  3.exit");
			int ch = s1.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Welcome to Novel section !");
					System.out.println("1.half girlfriend - 350/- 2.One Indian women - 150/- 3.50 Shades of grey - 400/-   4.exit ");
					System.out.println("Enter the product : ");
					 pro = s1.nextInt();
					if(pro==4)
						return;
					System.out.println("Enter the quantity : ");
					qty=s1.nextInt();
					if(pro==1)
					{
						amt1=qty*350;
						amt=amt+amt1;
						
					}
					else if(pro==2)
					{
						amt1=qty*150;
						amt=amt+amt1;
						
					}
					else if(pro==3)
					{
						amt1=qty*400;
						amt=amt+amt1;
					}
					break;
					
			case 2:  System.out.println("Welcome to Educational Books section!");
					System.out.println("1.Head First java - 300/- 2.Love with Robot - 250/- 3.Let us see- 500/-   4.exit ");
					System.out.println("Enter the product : ");
					pro = s1.nextInt();
					if(pro==4)
						return;
					System.out.println("Enter the quantity : ");
					qty=s1.nextInt();
					if(pro==1)
					{
						amt1=qty*300;
						amt=amt+amt1;
				
					}
					else if(pro==2)
					{
						amt1=qty*250;
						amt=amt+amt1;
				
					}
					else if(pro==3)
					{
						amt1=qty*500;
						amt=amt+amt1;
					}
					break;
			case 3:return;		
					
			default : System.out.println("Enter a valid choice !  ");
						break;
			 
					
			}
			
			

		}while(pro!=4);
		 
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
	System.out.println("\nNAME:"+name+ "\t\tCUST No:"+custno);
			/**
			*Display the total price
			*/
	System.out.println("\n\ntotal amount is "+amt+"Rs");
	System.out.println("Thank you for Shopping :)\n  Visit Again");
	
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
