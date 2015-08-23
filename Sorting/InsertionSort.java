package com.justcodeit;

import java.util.Arrays;

/**
 * @author Bhudev Sahu
 */

/*
 * Problem: Given an unsorted array, sort it using Insertion sort.
 * Ex:
 * I/P:
 * {5, 8, 6, 1, 3}
 * 
 * O/P:
 * {1, 3, 5, 6, 8}
 * 
 * Insertion sort: Traverse through the whole array for multiple rounds (in worst case, number of rounds is upper bounded by n*n where n is the 
 * number of elements). At any point of time this method maintains an already sorted list of number at the beginning. For the first time the single
 * element is considered to be already sorted. After each round this list increases until the list contains all the elements and the whole array 
 * is sorted.  
 * Insertion sort code can be written in a number of different ways but more or less it works the same way.
 * 
 */

public class InsertionSort 
{
	int[] array = {5, 8, 2, 6, 3, 1};
	
	public static void main(String[] args) 
	{
		new InsertionSort().insertionSort();

	}
	
	
	private void insertionSort()
	{
		for(int j = 1; j < array.length; j++)	//Outer loop to pick the number to be compared, x.
		{
			int x = array[j];	// x, the number which will get compared with already sorted numbers.
			int i;
			
			for (i = j-1; i >=0; i--) //Inner loop to put x in its right position in the sorted list.
			{
				if(array[i] > x)
				{
					array[i+1] = array[i];
				}
				else 
					break;
			}
			
			array[i+1] = x;
			System.out.println(Arrays.toString(array));		
			
		}
	}
}

