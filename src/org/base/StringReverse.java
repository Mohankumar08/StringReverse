package org.base;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("String Reverse");
		String original; 
		String reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
		reverse = reverse + original.charAt(i);
		System.out.println("Reverse of entered string is: " +
		reverse);
	}

}
