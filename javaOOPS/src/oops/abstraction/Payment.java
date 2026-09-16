package oops.abstraction;

import java.util.Scanner;

//1.Create an abstract class Payment with fields amount and transactionFee.
//Create an abstract method pay(double amount).
//Create child classes CreditCard, UPI, and NetBanking that calculate transaction fees (2%, 0%, and ₹10 respectively).
//Calculate and display the transaction fee and total amount to be paid.
//Print "Payment Successful" after completing the payment.

 public abstract class Payment {
	public static Scanner sc=new Scanner(System.in);
double amount;
double transactionFee;
abstract void pay();
}
class Creditcard extends Payment{

	@Override
	void pay() {
		System.out.println("enter amount: ");
		amount=sc.nextInt();
		transactionFee=0.2;
		amount+=((amount/100)*2);
		System.out.println("total amount:"+amount);
	}
	
}
class UPI extends Payment{

	@Override
	void pay() {
		System.out.println("enter amount: ");
		amount=sc.nextInt();
		System.out.println("total amount:"+amount);
	}
	
}
class NetBanking extends Payment{

	@Override
	void pay() {
		System.out.println("enter amount: ");
		amount=sc.nextInt();
		transactionFee=10;
		amount+=10;
		System.out.println("total amount:"+amount);
		
	}
	
}

