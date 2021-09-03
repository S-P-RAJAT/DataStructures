package com.bridgelabz.datastructures;

import java.util.Scanner;
import com.bridgelabz.linkedlist.*;

public class UnOrderedList {
	public static void main(String[] args) {
		MyLinkedList<String> linkedListObject = new MyLinkedList<String>();
		System.out.println("Enter any sentence:");
		Scanner scanner = new Scanner(System.in);
		String words = scanner.nextLine();
		String[] wordsInput = words.toLowerCase().split(" ");
		for (String wordPresent : wordsInput) {
			MyNodeImpl<String> node = new MyNodeImpl<String>(wordPresent);
			linkedListObject.appendNode(node);
		}
		for (String i : wordsInput)
			System.out.println(i);
		System.out.println("Which word has to be searched ??");
		String wordToBeSearched = scanner.next();
		System.out.println(wordToBeSearched);
		INodeIF<String> newNode = linkedListObject.search(wordToBeSearched);
		if (newNode == null) {
			MyNodeImpl<String> node = new MyNodeImpl<String>(wordToBeSearched);
			linkedListObject.appendNode(node);
			System.out.println(wordToBeSearched + " not found!");

		} else {
			System.out.println(wordToBeSearched + " is found!");

			linkedListObject.deleteGivenKeyNode(wordToBeSearched);
			System.out.println("The word is deleted");
		}
		linkedListObject.printNodes();
		scanner.close();
	}
}
