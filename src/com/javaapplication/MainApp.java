package com.javaapplication;

class Alien{
	
}

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Hello boss");
		String str = "adcd  ";
		System.out.println(str);
		String str1 = new String();
		System.out.println(str1);
		Alien a=new Alien();
		System.out.println(a);
		String s=new String("Hyder");
		System.out.println(s);

		
		StringBuffer sb = new StringBuffer("sachinrameshtendulkar");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.delete(6, 11);
		System.out.println(sb);
		
		sb.deleteCharAt(6);
		System.out.println(sb);
		
		//sb.deleteCharAt(21);
		StringBuffer sb1 = new StringBuffer("sachinrameshtendulkar");

		sb.compareTo(sb1);
		
		System.out.println();
		
//		sb.reverse();
//		System.out.println(sb);
//		
		
		sb.setLength(6);
		System.out.println(sb.length());
		System.out.println(sb);
		
		sb.trimToSize();
		System.out.println(sb);
		
		
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity());
		
		
	}

}
