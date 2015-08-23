package com.justcodeit;

/**
 * @author Bhudev Sahu
 */
/*
 * Problem: Given a string, return the reverse of it.
 * 
 * I/P:
 * Word
 * 
 * O/P:
 * droW
 */
public class StringReversal 
{

	public static void main(String[] args) 
	{
		String str = "Hello World";
		
		System.out.println(new StringReversal().reverseUsinSB(str));
		System.out.println(new StringReversal().reverse(str));
		System.out.println(new StringReversal().reverseRecursion(str));

	}
	
	private String reverseUsinSB(String str)	//method to reverse the string using StringBuffer.
	{
		String reverse = new StringBuffer(str).reverse().toString();
		return reverse;
	}
	
	private String reverse(String str)		//method to reverse the string character by character.
	{
		String reversed="";
		
		char[] ch = str.toCharArray();	//Convert string to character array.
		for (int i = ch.length-1; i >=0; i--) 
		{
			reversed+=ch[i];
		}
			
		return reversed;
	}
	
	private String reverseRecursion(String str)		//method to reverse the string recursively.
	{
		if(str.length()<2)		//Base condition after which the recursion ceases.
			return str;
		
		return (reverseRecursion(str.substring(1)) + str.charAt(0));
		
		
	}

}

