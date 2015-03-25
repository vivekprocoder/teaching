import java.io.*;
import java.util.*;

public class TestFileWrite
{
	public static void main(String args[]) 
	{
		double d = 2.0;
		int i = 3;
		Date date = new Date();

		try 
		{
	PrintWriter pw = new PrintWriter(new FileWriter("text1.txt"),true);
		pw.println("The value of d is " + d);
		pw.println("The value of i is " + i);
		pw.println("The time is " + date);
		pw.close();
    		} 
		catch (IOException ioe) 
		{
		System.out.println(ioe);
		} 
	} 
}