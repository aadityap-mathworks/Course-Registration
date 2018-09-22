package coursesRegistration.util;
/**
 * @author Aaditya Sakharam Patil
 *
 */
import coursesRegistration.scheduler.Allocation;
import coursesRegistration.scheduler.Courses;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;


public class FileProcessor {
	
	//Structure to store course details
	public static ArrayList<Courses> courseList = new ArrayList<Courses>();
	
	/**
	 * read input files and call scheduler
	 *
	 */
	public static void read(String cPrefFile, String cInfoFile)
	{
		try
		{
			//Read input files
			FileReader pref = new FileReader(new File(cPrefFile));
			FileReader info = new FileReader(new File(cInfoFile));
			BufferedReader prefReader = new BufferedReader(pref);
			BufferedReader infoReader = new BufferedReader(info);
			String currentline;
			
			//store course detail to the structure
			while ((currentline = infoReader.readLine()) != null) 
			{
				Courses cDetails = new Courses();
				
				//splitting the input line
				String part[] = currentline.split("[ ,:;-]+");
				
				//setting the values
				cDetails.setcName(part[0]);
				cDetails.setCapacity(Integer.parseInt(part[2]));
				cDetails.setTime(Integer.parseInt(part[4]));
				
				//add details to arraylist
				courseList.add(cDetails);
			}

			while ((currentline = prefReader.readLine()) != null) 
				{
					//splitting the input file 
					String part[] = currentline.split("[ ,:;]+");
					
					//calling scheduler to allocate courses
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
	            System.exit(0);
	            ex.printStackTrace();
	        } 
		catch (IOException ex)
	        {
	            System.out.println("Error occureed while reading the file '");
	            System.exit(0);
	            ex.printStackTrace();
	
	        }	
		finally
		{
			
		}
		
		
	}

	@Override
	public String toString() {
		return "FileProcessor [toString()=" + super.toString() + "]";
	}
	
	
}