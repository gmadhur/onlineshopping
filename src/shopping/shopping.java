/**
 * 
 */
package shopping;

import java.util.Scanner;
/**
 * @author Lenovo
 *
 */
public class shopping {

	/**
	 * @param args
	 */
	static int custno,amt;
	static String name;
	shopping[] c= new shopping[5];
	public static void Electronics() {
		int pro, qty,amt1;
		Scanner s1 = new Scanner(System.in);
		System.out.println("          ELECTRONICS     ");
		System.out.println("      WELCOME         "+name);
		do {
		System.out.println("1.mobile  = 100/-\n2.Laptop  = 1000/-\n3.exit ");
		System.out.println("enter your choice:");
		pro = s1.nextInt();
		if(pro==3)
			return;
		System.out.println("enter the quantity");
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
	public static void Fashion() {
		int pro, qty,amt1;
		int i;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("          FASHION    ");
		System.out.println("      WELLCOME         "+name);
		do {
		System.out.println("1.shirt  = 100/-\n2.pant  = 1000/-\n 3.exit");
		System.out.println("enter the product");
		pro = s1.nextInt();
		if(pro==3)
			return;
		System.out.println("enter the quantity");
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
	public static void Books() {
		int pro, qty,amt1;
		Scanner s1 = new Scanner(System.in);
		System.out.println("          BOOKS    ");
		System.out.println("      WELLCOME         "+name);
		do {
		System.out.println("1.ABCD  = 100/-\n2.NOPQ = 1000/-\n3.exit ");
		System.out.println("enter the product");
		pro = s1.nextInt();
		if(pro==3)
			return;
		System.out.println("enter the quantity");
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
	public static void Bill() {
	System.out.println("NAME:"+name+ "\tCUST No:"+custno);
	
	System.out.println("\n\ntotal amount is "+amt+"Rs");
	
	
	}
	public static void main(String[] args) {
		int choice;
		
		shopping[] c = new shopping[5];
		Scanner s=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("enter your custno");
		custno=s.nextInt();
		System.out.println("enter your name ");
		name=s2.next();
		do {
			System.out.println("1.Electronics\n 2.Fashion\n 3.Books\n 4.Bill");
			System.out.println("enter your choice");
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
