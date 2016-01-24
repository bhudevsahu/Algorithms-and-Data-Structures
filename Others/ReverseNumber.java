package com.justcodeit;

/**
 * @author Bhudev Sahu
 */

/*
 * Problem: Given a integer number, return the reverse of it.
 * 
 * Ex:
 * I/P:
 * 5324
 * 
 * O/P:
 * 4235
 * 
 */
public class ReverseNumber
{

	public static void main(String[] args) 
	{
		System.out.println(reverse(6281));		//Call to reverse method

	}
	
	
	static int reverse(int num)			// reverse method which computes the reverse of the given integer.
	{
		int reversed = 0;		
		
		while(num!=0)
		{
			reversed = (reversed * 10) + (num % 10);
			num = num / 10;
		}
		
		return reversed;
	}
}

