import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class that wraps console access functions.
 * 
 * @author Pietrofrancesco Apollonio
 *
 */
public class ConsoleWrapper
{

	/**
	 * The {@link BufferedReader} that is used to access the Console.
	 */
	private static final BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
	
	/**
	 * Method to obtain a String read from the console.
	 * 
	 * @return A String read from the Console.
	 * 
	 */
	protected static String readString()
	{
		try
		{
			return input.readLine().trim();
		}
		catch ( IOException e )
		{
			System.out.println("An error occurs while reading the value from the Console.");
			return null;
		}

	}
	
	/**
	 * Method to obtain a int read from the console.
	 * 
	 * @return An int read from the Console.
	 * 
	 */
	protected static int readInt()
	{
		return Integer.parseInt(readString());
	}
	
	/**
	 * Method to obtain a float read from the console.
	 * 
	 * @return A float read from the Console.
	 * 
	 */
	protected static float readFloat()
	{
		return Float.parseFloat(readString());
	}
	
	/**
	 * Method to obtain a double read from the console.
	 * 
	 * @return A double read from the Console.
	 * 
	 */
	protected static double readDouble()
	{
		return Double.parseDouble(readString());
	}
	
	/**
	 * Method to obtain a long read from the console.
	 * 
	 * @return A long read from the Console.
	 * 
	 */
	protected static long readLong()
	{
		return Long.parseLong(readString());
	}
	
	/**
	 * Method to obtain a short read from the console.
	 * 
	 * @return A short read from the Console.
	 * 
	 */
	protected static long readShort()
	{
		return Short.parseShort(readString());
	}
	
}
