package com.justcodeit;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Bhudev Sahu
 */

/*
 * Problem: Given an integer array (sorted/unsorted/random), return the number of duplicate numbers in the array.
 * 
 * Ex:
 * I/P:
 * {1,3,1,4,5,1,3,2}
 * 
 * O/P:
 * 2
 * 
 * Similar way of solving can be used for variety of questions, as discussed in the video.
 */
public class CountDuplicates 
{


	public static void main(String[] args) 
	{
		int[] array = {1,2,3,4,3,3,3,3,1,7,4,4};		//Declare an array with repeated numbers.
		System.out.println(countDuplicates(array));

	}
	
	static int countDuplicates(int[] array)			//Method to count the number of duplicate elements/
	{
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();	//Declare a HashMap.
		int noOfDuplicates = 0;				//Initialise a variable to hold the number of duplicates. 
		
		for (int i : array) 
		{
			if(hash.containsKey(i))			//If the HashMap already has the coming number as key.
			{
				hash.put(i, hash.get(i)+1);
			}
			else							//If it does not have it as key then put it for the first time with value 1.
			{
				hash.put(i, 1);
			}
		}
		
		Set<Integer> set = hash.keySet();		//Set to hold all the keys.
		for (int i : set) 						
		{
			if(hash.get(i) > 1)				//Check for duplicate elements.
			{
				noOfDuplicates++;
			}
		}
		
		return noOfDuplicates;
	}

}

