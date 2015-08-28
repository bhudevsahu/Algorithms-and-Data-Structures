package com.justcodeit;

/**
 * @author Bhudev Sahu
 */
/*
 * Problem: Given a word, return the compressed word, meaning if there is any letter in the word consecutively the replace them with the number of
 * occurrence of the letter. If appeared just once let it be like that.
 * Ex:
 * I/P:
 * aaaaabbbbbbbbbccccdeeeeeee
 * 
 * O/P:
 * a5b9c4de7
 */


public class CompressWord 
{
	public static void main(String args[])
	{
		System.out.println(compress("aaabccccddddeeeeeeeeeef"));
	}
	
	static String compress(String str)		//Method which compresses the given string.
	{
		if(str.length()<2)					//If the string contains a single character then return it.
			return str;
		
		char[] ch = str.toCharArray();		//Convert to character array.
		String output = "";
		
		//Initialise counters to keep track of repeated characters.
		int i = 1;					
		int j = 0;
		
		int count = 1;
		
		while(i<ch.length)
		{
			if(ch[i]==ch[j])			//If we have consecutive characters.
			{
				i++;
				count++;
			}
			else						//Found a different character.
			{
				if(count>1)				//If it appears more than once.
				{
					output+=""+ch[j]+count;
					count = 1;
				}
				else					//If it appears just once.
				{
					output+=""+ch[j];
				}
				
				i++;					//Readjust the counters.
				j=i-1;
			}			
		}
		if(count>1)
		{
			return output+""+ch[j]+count;
		}
		else
		{
			return output+""+ch[j];
		}
	}
}

