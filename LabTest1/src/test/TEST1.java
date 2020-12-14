package test;

import java.util.Scanner;

public class TEST1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Question 1:");
		int quantity;
		System.out.print("Enter number of item :");
		quantity=sc.nextInt();
		if (quantity==3) {
		double quantity1,quantity2,quantity3,total_price;
		double price1,price2,price3,discount,price_to_paid;
		System.out.print("Enter price for first item : Rm");
		price1=sc.nextDouble();
		System.out.print("Enter quantity for first item :");
		quantity1=sc.nextInt();
		System.out.println();
		System.out.print("Enter price for second item : RM ");
		price2=sc.nextDouble();
		System.out.print("Enter quantity for second item :");
		quantity2=sc.nextInt();
		System.out.println();
		System.out.print("Enter price for third item : RM");
		price3=sc.nextDouble();
		System.out.print("Enter quantity for that item :");
		quantity3=sc.nextInt();
		total_price=(price1*quantity1)+(price2*quantity2)+(price3*quantity3);
		if (total_price>100) {
			discount=total_price*0.2;
		}
		else {
			discount=total_price*0.1;
		}
		price_to_paid=total_price-discount;
		System.out.println();
		System.out.print("Total price : RM" + total_price);
		System.out.println();
		System.out.print("Discount received : Rm" + discount);
		System.out.println();
		System.out.print("Price to be paid: RM" +price_to_paid);
		}
		if (quantity==2) {
			double quantity1,quantity2,total_price;
			double price1,price2,discount,price_to_paid;
			System.out.print("Enter price for first item : Rm");
			price1=sc.nextDouble();
			System.out.print("Enter quantity for first item :");
			quantity1=sc.nextInt();
			System.out.println();
			System.out.print("Enter price for second item : RM ");
			price2=sc.nextDouble();
			System.out.print("Enter quantity for second item :");
			quantity2=sc.nextInt();
			total_price=(price1*quantity1)+(price2*quantity2);
			if (total_price>100) {
				discount=total_price*0.2;
			}
			else {
				discount=total_price*0.1;
			}
			price_to_paid=total_price-discount;
			System.out.println();
			System.out.print("Total price : RM" + total_price);
			System.out.println();
			System.out.print("Discount received : Rm" + discount);
			System.out.println();
			System.out.print("Price to be paid: RM" +price_to_paid);
			}
		if (quantity==1) {
			double quantity1,total_price;
			double price1,discount,price_to_paid;
			System.out.print("Enter price for first item : Rm");
			price1=sc.nextDouble();
			System.out.println();
			System.out.print("Enter quantity for first item :");
			quantity1=sc.nextInt();
			total_price=(price1*quantity1);
			if (total_price>100) {
				discount=total_price*0.2;
			}
			else {
				discount=total_price*0.1;
			}
			price_to_paid=total_price-discount;
			System.out.println();
			System.out.print("total price : RM" + total_price);
			System.out.println();
			System.out.print("Discount received : Rm" + discount);
			System.out.println();
			System.out.print("Price to be paid: RM" +price_to_paid);
			}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Question 2:");
		System.out.print("Enter sales : RM");
		double sales;
		sales=sc.nextDouble();
		if (sales>=150.00&&sales<=300.00) {
			System.out.print("Enter hours worked :");
			int hour;
			hour=sc.nextInt();
			double commision;
			commision=sales*0.05;
			double dailywage;
			dailywage=commision+(hour*5);
			System.out.println();
			System.out.print("Commision : RM" +commision);
			System.out.println();
			System.out.print("Daily wage : RM" +dailywage);
		}
		if (sales>=301.00&&sales<=500.00) {
			System.out.print("Enter hours worked :");
			int hour;
			hour=sc.nextInt();
			double commision;
			commision=sales*0.10;
			double dailywage;
			dailywage=commision+(hour*5);
			System.out.println();
			System.out.print("Commision : RM" +commision);
			System.out.println();
			System.out.print("Daily wage : RM" +dailywage);
		}
		if (sales>500.00) {
			System.out.print("Enter hours worked :");
			int hour;
			hour=sc.nextInt();
			double commision;
			commision=sales*0.15;
			double dailywage;
			dailywage=commision+(hour*5);
			System.out.println();
			System.out.print("Commision : RM" +commision);
			System.out.println();
			System.out.print("Daily wage : RM" +dailywage);
		}
	}
}
