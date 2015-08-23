package com.justcodeit;

/**
 * @author Bhudev Sahu
 */

/*
 * Problem: Create a singleton class.
 * At any point, singleton class has only one instance of object.
 */

class Singleton
{
	private static Singleton singleObj = new Singleton();	// Single object instance.
	
	public static Singleton getInstance()	//static method which returns the only object of Singleton class.
	{
		return singleObj;
	}
	
	private Singleton()		//Prevents from creating any other object instance.
	{
		
	}
	
	public void method()
	{
		System.out.println("Hello Singleton");
	}
}

public class SingletonClass 
{

	public static void main(String[] args) 
	{
		//Singleton single = new Singleton(); ----- The object of the singleton class is not possible to make.
		Singleton.getInstance().method();	//Call the method by getting the only instance of Singleton class. 

	}

}

