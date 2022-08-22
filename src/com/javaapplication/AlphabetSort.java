package com.javaapplication;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string value: ");
		String str = sc.nextLine();
		char charArr[] = str.toCharArray();
		Arrays.sort(charArr);
		System.out.println(new String(charArr));
	}

}
