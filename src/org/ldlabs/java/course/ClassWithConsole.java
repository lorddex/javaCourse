package org.ldlabs.java.course;
/**
 * Simple main with console access.
 * 
 * @author Pietrofrancesco Apollonio
 *
 */
public class ClassWithConsole
{

	public static void main(String[] args)
	{
		
		System.out.print("Insert a number: ");
		int val = Console.readInt();
		System.out.println("Value read: " + val);
		System.out.print("Insert a string: ");
		String strVal = Console.readString();
		System.out.println("Value read: " + strVal);
		
	}
	
}
