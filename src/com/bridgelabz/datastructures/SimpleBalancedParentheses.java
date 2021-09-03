package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.linkedlist.MyNodeImpl;
import com.bridgelabz.stacks.*;

public class SimpleBalancedParentheses {
	private static boolean parenthesesChecker(char[] expression) {
		MyStack<Character> myStack = new MyStack<Character>();
		for(char ch : expression) {
			MyNodeImpl<Character> node = new MyNodeImpl<Character>(ch);

			if(ch == '(' ) {
				myStack.push(node);
			}
			else if(ch == ')') {
				if(myStack.isEmpty()) return false;
				myStack.pop();
			}
		}
		return myStack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Arithmetic Expression");
		String inputExpression = sc.nextLine();
		char[] expression = inputExpression.toCharArray();

		System.out.println("The proposition that expression "+inputExpression+" is balanced is "+ parenthesesChecker(expression));
		sc.close();
	}
}
