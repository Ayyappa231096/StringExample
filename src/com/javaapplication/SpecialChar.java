package com.javaapplication;

import java.util.Scanner;

public class SpecialChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the special char: ");
		String s = sc.nextLine();

		int counter = 0;

		for (int i = 0; i < s.length(); i++) {

			if (isSpecialChar(s.charAt(i))) {
				counter++;
			}

		}
		System.out.println("Count of special char: " + counter);

		sc.close();
	}

	private static boolean isSpecialChar(char ch) {

		boolean isSpecialChar;
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			isSpecialChar = false;
		} else if (ch >= '0' && ch <= '9') {
			isSpecialChar = false;
		} else {
			isSpecialChar = true;
		}
		return isSpecialChar;
	}

}
