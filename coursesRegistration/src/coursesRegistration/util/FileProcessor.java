package coursesRegistration.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
	
	public static void read(String cPrefFile, String cInfoFile)
	{
		try
		{
			//using file reader
			FileReader pref = new FileReader(new File(cPrefFile));
			FileReader info = new FileReader(new File(cInfoFile));
			BufferedReader prefReader = new BufferedReader(pref);
			BufferedReader infoReader = new BufferedReader(info);
			String currentline;
			while ((currentline = prefReader.readLine()) != null) 
				{
					//splitting the input file with spaces
					String part[] = currentline.split("[ ,:;]+");
					int x =part.length;
					for(int i=0; i<9 ;i++)
					{
						System.out.print(" "+part[i]);
					}
					System.out.println(x);
				
				}
			while ((currentline = infoReader.readLine()) != null) 
			{
				//splitting the input file with spaces
				String part[] = currentline.split("[ ,:;-]+");
			
				for(int i=0; i<part.length ;i++)
				{
					System.out.print(" "+part[i]);
				}
				System.out.println("");
			
			}
			
			//close buffered reader
			prefReader.close();
		
		}		
		//catch block
		catch (FileNotFoundException ex)
	        {
	            System.out.println("Cannot find the file '");
	            ex.printStackTrace();
	        } 
		catch (IOException ex)
	        {
	            System.out.println("Error occureed while reading the file '");
	            ex.printStackTrace();
	
	        }
	}
	
}
