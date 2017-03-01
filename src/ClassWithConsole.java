/**
 * Simple main with console access.
 * 
 * @author Pieatrofrancesco Apollonio
 *
 */
public class ClassWithConsole extends ConsoleWrapper
{

	public static void main(String[] args)
	{
		
		System.out.print("Insert a number: ");
		int val = readInt();
		System.out.println("Value read: " + val);
		System.out.print("Insert a string: ");
		String strVal = readString();
		System.out.println("Value read: " + strVal);
		
	}
	
}
