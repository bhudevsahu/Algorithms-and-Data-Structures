package com.justcodeit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bhudev Sahu
 */
/*
 * Problem: Take the input from the user and print the in different line. However if the number is a multiple of 2 then print "Fizz" and if it 
 * is a multiple of 5 then print "Buzz" and if multiple of both 3 and 5 then print "FizzBuzz";
 * 
 * Ex:
 * I/P:
 * 15
 * 
 * O/P:
 *  1
 *  2
 *  Fizz
 *  4
 *  Buzz
 *  Fizz
 *  7
 *  8
 *  Fizz
 *  Buzz
 *  11
 *  Fizz
 *  13
 *  14
 *  FizzBuzz
 */
public class FizzBuzz 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//Take the input from the user.
		int input = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= input; i++) 		//Print every number from 1 till input.
		{
			if(i%3==0 && i%5==0)				//If the number is multiple of both 3 and 5.
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3==0)						//If the number is multiple of 3.
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)						//If the number is multiple of 5.
			{
				System.out.println("Buzz");
			}
			else								//If the number is neither a multiple of 3 nor 5.
			{
				System.out.println(i);
			}
		}
	}

}

