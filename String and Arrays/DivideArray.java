package com.justcodeit;

import java.util.Arrays;

/**
 * @author Bhudev Sahu
 */

/*
 * Problem: Divide a given array into two sub-arrays and print them based on the sum of their elements, i.e. the sum of the elements of the 
 * left sub-array will be equal to the sum of all the elements in right sub-array.
 * Ex:
 * I/P:
 * {2,6,8,5,4,2,4,1}
 * 
 * O/P:
 * {2,6,8}
 * {5,4,2,4,1}
 * 
 * There can be varieties of questions around the same way of solving it.
 * One can be find the middle index in an array, from where the sum of left sub array elements and right array elements are equal.
 * Simply return "endIndex" in such case.
 */
public class DivideArray 
{

	public static void main(String[] args) 
	{
		int[] array = {5, 2, 3, 1, 2, 4, 3};
		divide(array);
		

	}
	
	static void divide(int[] array)
	{
		int[] array1 = null;		// Define two sub-arrays and initialise them with null.
		int[] array2 = null;
		
		int endIndex = array.length-1;
		int startIndex = 0;
		
		int sumLeft = 0;
		int sumRight = 0;
		
		while(startIndex <= endIndex)	
		{
			if(sumLeft<sumRight)
			{
				sumLeft+=array[startIndex++];
			}
			else
				sumRight+=array[endIndex--];
		}
		
		if(sumLeft==sumRight)
		{
			array1 = new int[endIndex+1];			// Instantiate both sub-arrays. 
			array2 = new int[array.length-endIndex-1];
			
			int i; 	//Works as an index to separate the array into two sub-arrays, to keep track up till which element the left sub-array will fill.
			
			for (i = 0; i < array1.length ; i++) 
			{
				array1[i] = array[i];
			}
			
			//i's value still not changed.
			
			for (int j = 0; j < array2.length; j++) 
			{
				array2[j] = array[i];
				i++;
			}
			
			System.out.println(Arrays.toString(array1));	// Print both sub-arrays
			System.out.println(Arrays.toString(array2));
		}
		else									// Could not find such sub-arrays
			System.out.println("No such combination");
	}

}

