package com.javaapplication;

import java.util.Scanner;

public class ReverseSent {
	
	static void reverseString(String in) {
		
		char[] inArr=in.toCharArray();
		char[] result=new char[inArr.length];
		
		for(int i=0;i<inArr.length;i++) {
			if(inArr[i]==' ') 
			{
				result[i]=' ';
			}
		}
		
		int j=result.length-1;
		
		for(int i=0;i<inArr.length;i++)
		{
			if(inArr[i]!=' ') {
				
				if(result[j]==' ') {
					j--;
				}
				result[j]=inArr[i];
				j--;
			}
		}
		System.out.println(String.valueOf(result));
		
	}
	
	
	public static void main(String[] args) {

		reverseString("Think Twice");

	}
}