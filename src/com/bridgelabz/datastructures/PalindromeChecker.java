package com.bridgelabz.datastructures;

import java.util.Scanner;
import com.bridgelabz.deque.*;
import com.bridgelabz.linkedlist.MyNodeImpl;

public class PalindromeChecker {
	private static boolean check(char[] charArray) {
		MyDeque<Character> myDeque = new MyDeque<Character>();
		
		for (char ch : charArray) {
			MyNodeImpl<Character> node = new MyNodeImpl<Character>(ch);
			myDeque.addRear(node);
		}
	    boolean stillEqual = true;

	    while (myDeque.size() > 1 && stillEqual) {
	        if (myDeque.removeFront().getKey() != myDeque.removeRear().getKey()) { 
	            stillEqual = false;
	        }
	    }
	    return stillEqual;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = sc.nextLine();
		char[] charArray = string.toCharArray();

		System.out.println(string + " is  a palindrome : " + check(charArray));
		sc.close();
	}
}
