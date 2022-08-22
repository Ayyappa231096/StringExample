package com.javaapplication;

import java.util.Arrays;
import java.util.Scanner;

public class MaxChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char temp[] = s.toCharArray();
		Arrays.sort(temp);
		String s1 = new String(temp);
		int n = s1.length();
		int max_count = 0;
		int count = 1;
		char ans = '-';
		for (int i = 1; i <= n; i++) {
			if ((i == n) || (s1.charAt(i) != s1.charAt(i) - 1)) {
				if (max_count < count) {
					max_count = count;
					ans = s1.charAt(i - 1);
				}
				count = 1;
			} else {
				count++;
			}
		}
		System.out.println("Most occurring character is " + ans);
	}

}
