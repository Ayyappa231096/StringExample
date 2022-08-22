package com.javaapplication;

public class Vowel {

	public static void main(String[] args) {

		int v = 0, c = 0;

		String str = "Hello ineuron team";
		String s = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				v++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				c++;
			}
		}
		System.out.println("Number of vowels: " + v);
		System.out.println("Number of consonants: " + c);

	}
}