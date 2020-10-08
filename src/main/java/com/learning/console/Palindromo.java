package com.learning.console;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		System.out.println("por favor ingrese una palabra");
		Scanner scanner= new  Scanner(System.in);
		String word = scanner.next();
		scanner.close();
	   boolean prueba= isPalindrome(word);
	   
	  if(prueba) {
		  System.out.println(word +" es una palabra palindroma");
	  }else {
		  System.out.println(word +" no es una palabra palindroma");
	  }
	}
	
	public static  boolean isPalindrome(String word) {
		
		int wordSize = word.length()-1;
		int start =0;
		boolean match=true;
		while(wordSize !=0) {
			if(word.charAt(start) != word.charAt(wordSize)) {
				match=false;
				break;
			}else {
				start++;
				wordSize --;
			}
			
		}
		
		return match;
	}
	
}
