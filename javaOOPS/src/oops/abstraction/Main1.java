package oops.abstraction;

import java.util.Scanner;

public class Main1 {
		public static void main(String[] args) {
			System.out.println("main method started");
			Scanner sc=new Scanner(System.in);
			Payment pay1=new Creditcard();
			Payment pay2=new UPI();
			Payment pay3=new NetBanking();
			
			System.out.println("1.creditcard");
			System.out.println("2.UPI");
			System.out.println("3.netbanking ");
			System.out.println("enter payment method: ");
			int num=sc.nextInt();
			switch(num) {
			case 1 ->{
			pay1.pay();
			}
			case 2 ->{
				pay2.pay();
			}
			case 3 ->{
				pay3.pay();
			}
			}
			sc.close();
		}
	}
