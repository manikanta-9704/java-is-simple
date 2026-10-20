package com.collections.browserhistorymanager;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Develop a browser history manager using Java collections.
//
//Your program must support these operations:
//
//VISIT url — Visit a new website and add it to the browsing history.
//BACK — Move to the previously visited website.
//FORWARD — Move to the next website if available.
//CURRENT — Display the currently visited website.
//HISTORY — Display the browsing history.
//CLEAR_FORWARD — Clear forward history after visiting a new website.

//for this using deque is better approach because we can achieve LIFO using deque 
//by stack inherited methods violates LIFO principle
public class BrowserHistoryManager {

	public static void main(String[] args) {
		int option;
		Scanner sc=new Scanner(System.in);
		Deque<String> dq=new ArrayDeque<>();
		do {
		System.out.println("enter a option: ");
		option=sc.nextInt();
		switch (option){
		case 1->{
			System.out.println("search");
			sc.nextLine();
			String search=sc.next();
			dq.push(search);
		}
		case 2->{
			dq.pop();
			System.out.println(dq.peek());
		}
		case 3->{
			System.out.println(dq);
		}
		default->{
			System.out.println("invalid option");
			
		}
		}
		}while(option>0);
		

	}
	}
