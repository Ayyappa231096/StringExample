package com.javaapplication;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder("hello ");
		//sb.append("java");
		//sb.insert(4, "Good morning");
		sb.replace(1, 3,"Java");
		sb.delete(1, 4);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		
		

	}

}
