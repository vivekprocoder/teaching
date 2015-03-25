import java.io.*;

public class TestFile
{
	public static void main(String args[]) 
	{
		String str;

		try 
		{
		BufferedReader br = 
		new BufferedReader(new FileReader("Test.txt"));
			while ((str = br.readLine()) != null) 
			{
			System.out.println(str);
			} 
		br.close();
		} 
		catch (FileNotFoundException fnfe) 
		{
		System.out.println(fnfe);
		return;
		}
		 catch (IOException ioe) 
		{
		System.out.println(ioe);
		} 
	} 
}