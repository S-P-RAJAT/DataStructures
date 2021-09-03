package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.linkedlist.INodeIF;
import com.bridgelabz.linkedlist.MyLinkedList;
import com.bridgelabz.linkedlist.MyNodeImpl;
import com.bridgelabz.linkedlist.SortedLinkedList;

public class OrderedList {
	public static void main(String[] args) {
		SortedLinkedList<String> linkedListObject = new SortedLinkedList<String>();
		System.out.println("Enter any sentence:");
		Scanner scanner = new Scanner(System.in);
		String words = scanner.nextLine();
		String[] wordsInput = words.toLowerCase().split(" ");
		for (String wordPresent : wordsInput) {
			MyNodeImpl<String> node = new MyNodeImpl<String>(wordPresent);
			linkedListObject.add(node);
		}
		for (String i : wordsInput)
			System.out.println(i);
		System.out.println("Which word has to be searched ??");
		String wordToBeSearched = scanner.next();
		System.out.println(wordToBeSearched);
		INodeIF<String> newNode = linkedListObject.search(wordToBeSearched);
		if (newNode == null) {
			MyNodeImpl<String> node = new MyNodeImpl<String>(wordToBeSearched);
			linkedListObject.add(node);
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
