package com.justcodeit;

import java.util.Arrays;

/**
 * @author Bhudev Sahu
 */

/*
 * Problem: Given an unsorted array, sort it using Bubble sort.
 * Ex:
 * I/P:
 * {6,3,8,1,5}
 * 
 * O/P:
 * {1,3,5,6,8}
 * 
 * Bubble sort: Traverse through the whole array for multiple rounds (in worst case number of rounds is upper bounded by n*n where n is the number 
 * of elements). After the end of each round the greatest element in array for that round (considering ascending order) will come in the right most 
 * side before elements greater than it. 
 * Loop can be formed in number of different ways, I have showed two of them here.
 * 
 */
public class BubbleSort 
{
	
	int[] array = {3, 7, 8, 1, 5};
	
	public static void main(String[] args) 
	{
		new BubbleSort().bubbleSort();
		new BubbleSort().bubbleSortAnotherWay();

	}
	
	private void bubbleSort()
	{
		// i starts at the end of the Array and decrements the counter in opposite direction.
		for(int i = array.length-1; i > 0; i--)
		{
			// The inner loop starts at the beginning of the array and goes till the index i.
			for(int j = 0; j < i; j++)
			{
				if(array[j]>array[j+1]) 	//(array[j] < array[j+1]): will sort in descending order.
				{
					swap(j, j+1);
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}	
	private void bubbleSortAnotherWay()
	{

		// i starts at the beginning of the array
		
		for(int i = 0; i < array.length; i++){
			
			// The inner loop starts at the beginning of the array, an index ahead than i. 
			
			for(int j = 1; j < (array.length - i); j++)
			{
				
				// Here we check if the 1st index is less than the next during the first run through
				// Then we just increase the indexes until they have all been checked.
				
				if(array[j-1] > array[j]){
					
					swap(j-1, j);
					
				}
				
			}
			System.out.printf("array after %d pass: %s %n", i+1, Arrays.toString(array)); // Another way of printing rounds.
		}
	}
	
	private void swap(int a, int b)	// Swap function, Note: it works with array and its indexes, to make sure it works 
	{								// the array has been defined globally.
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}

