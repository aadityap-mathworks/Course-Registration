package coursesRegistration.util;

import coursesRegistration.scheduler.Allocation;
import coursesRegistration.scheduler.Courses;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class FileProcessor {
	
	
	public static ArrayList<Courses> courseList = new ArrayList<Courses>();
	
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
			
			while ((currentline = infoReader.readLine()) != null) 
			{
				
				Courses cDetails = new Courses();
				
				//splitting the input file with spaces
				String part[] = currentline.split("[ ,:;-]+");
				cDetails.setcName(part[0]);
				cDetails.setCapacity(Integer.parseInt(part[2]));
				cDetails.setTime(Integer.parseInt(part[4]));
				
				courseList.add(cDetails);
			}

			int count=0;
			while ((currentline = prefReader.readLine()) != null) 
				{
					//splitting the input file 
					String part[] = currentline.split("[ ,:;]+");
					count++;
					System.out.println("line" +count);
					//allocation
					Allocation.allocate(part);
					
				}
			
			//close buffered reader
			prefReader.close();
			infoReader.close();
			pref.close();
			info.close();
			
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

	@Override
	public String toString() {
		return "FileProcessor [toString()=" + super.toString() + "]";
	}
	
	
}