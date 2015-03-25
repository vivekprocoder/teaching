import java.io.*;
class ExceptionExample
{
	public static void main(String args[])throws Exception
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println("division is "+(a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero error in program");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Error");
		}
	}
}